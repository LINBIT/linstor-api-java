package com.linbit.linstor.api;

import com.linbit.linstor.api.model.ApiCallRc;
import com.linbit.linstor.api.model.ApiCallRcList;

public class ApiCallChecker {
    public static boolean isError(ApiCallRc apiCallRc) {
        return (apiCallRc.getRetCode() & ApiConsts.MASK_ERROR) == ApiConsts.MASK_ERROR;
    }

    public static boolean isInfo(ApiCallRc apiCallRc) {
        return (apiCallRc.getRetCode() & ApiConsts.MASK_INFO) == ApiConsts.MASK_INFO;
    }

    public static boolean isWarning(ApiCallRc apiCallRc) {
        return (apiCallRc.getRetCode() & ApiConsts.MASK_WARN) == ApiConsts.MASK_WARN;
    }

    public static boolean hasError(ApiCallRcList apiCalls) {
        for (ApiCallRc apiCallRc : apiCalls) {
            if (isError(apiCallRc)) {
                return true;
            }
        }
        return false;
    }
}
