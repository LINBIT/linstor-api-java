package com.linbit.linstor.api;

import com.linbit.linstor.api.model.ResourceDefinitionCloneStarted;
import com.linbit.linstor.api.model.ResourceDefinitionCloneStatus;

public class CloneWaiter {

    public static boolean waitFor(
        DevelopersApi api,
        ResourceDefinitionCloneStarted cloneStarted) throws ApiException
    {
        return waitFor(api, cloneStarted, 0, 500);
    }

    public static boolean waitFor(
        DevelopersApi api,
        ResourceDefinitionCloneStarted cloneStarted,
        long timeoutSec,
        long waitIntervalMs) throws ApiException
    {
        final long startTime = System.currentTimeMillis();

        while (true) {
            ResourceDefinitionCloneStatus cloneStatus = api.resourceDefinitionCloneStatus(
                cloneStarted.getSourceName(), cloneStarted.getCloneName());

            switch(cloneStatus.getStatus()) {
                case COMPLETE: return true;
                case FAILED: return false;
                case CLONING:
                default:
                    if (timeoutSec > 0 && (startTime + timeoutSec * 1000) < System.currentTimeMillis()) {
                        throw new RuntimeException(
                            String.format("%s didn't finish clone in time.", cloneStarted.getCloneName()));
                    }
                    try
                    {
                        Thread.sleep(waitIntervalMs);
                    } catch (InterruptedException exc) {
                        throw new RuntimeException(exc);
                    }
            }
        }
    }
}
