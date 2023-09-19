package com.green.winey_final.admin.model;

import com.green.winey_final.repository.support.PageCustom;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserOrderDetailList {
    private UserInfo userInfo;
    private PageCustom<UserOrderDetailVo> userOrderList;
}
