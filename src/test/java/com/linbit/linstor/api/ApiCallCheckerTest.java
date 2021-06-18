package com.linbit.linstor.api;

import com.linbit.linstor.api.model.ApiCallRc;
import com.linbit.linstor.api.model.ApiCallRcList;

import org.junit.Assert;
import org.junit.Test;

public class ApiCallCheckerTest {

    @Test
    public void testHasErrors() {
        {
            ApiCallRcList apiCallRcsSuccess = new ApiCallRcList();
            apiCallRcsSuccess.add(new ApiCallRc().message("test msg").retCode(
                ApiConsts.MASK_SUCCESS | ApiConsts.MASK_CRT | ApiConsts.MASK_NODE));
            apiCallRcsSuccess.add(new ApiCallRc().message("test msg2").retCode(
                ApiConsts.MASK_WARN | ApiConsts.MASK_MOD | ApiConsts.MASK_NODE));

            Assert.assertFalse(apiCallRcsSuccess.hasError());
        }

        {
            ApiCallRcList apiCallRcsError = new ApiCallRcList();
            apiCallRcsError.add(new ApiCallRc().message("test msg").retCode(
                ApiConsts.MASK_SUCCESS | ApiConsts.MASK_CRT | ApiConsts.MASK_NODE));
            apiCallRcsError.add(new ApiCallRc().message("test msg3").retCode(
                ApiConsts.MASK_ERROR | ApiConsts.MASK_MOD | ApiConsts.MASK_NODE));
            apiCallRcsError.add(new ApiCallRc().message("test msg2").retCode(
                ApiConsts.MASK_INFO | ApiConsts.MASK_MOD | ApiConsts.MASK_NODE));

            Assert.assertTrue(apiCallRcsError.hasError());
            Assert.assertTrue(apiCallRcsError.get(1).isError());
        }
    }
}
