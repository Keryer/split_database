package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@TableName(value ="so_order")
public class order {
    private long id;
    private String orderId;
    private long merchantId;
    private long dyShopId;
    private String shopId;
    private long channelId;
    private int status;
    private String orderIndex;
    private int orderType;
    @TableField(value = "LATEST_SEND_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp latestSendTime;
    private String toName;
    private String toAddress;
    private String toAddressDetail;
    private String toPhone;
    private String toBackupPhone;
    private String toPrivacyPhone;
    private double toLng;
    private double toLat;
    private long goodsCount;
    private long userPay;
    private long totalFee;
    private long shopFee;
    @TableField(value = "CREATE_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp createTime;
    @TableField(value = "UPDATE_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp updateTime;
    private int version;
    private long weight;
    private long packageFee;
    private int deliveryType;
    private String remark;
    @TableField(value = "SUBSCRIBE_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp subscribeTime;
    private String shopName;
    private byte isSubscribe;
    private byte isRemind;
    private byte isPrint;
    private byte isCancel;
    private byte isError;
    private byte isNew;
    private byte isDispatch;
    private byte isPickup;
    private byte isDeliver;
    private byte isHistory;
    private byte isRevise;
    @TableField(value = "REMIND_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp remindTime;
    @TableField(value = "POST_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp postTime;
    @TableField(value = "RIDER_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp riderTime;
    @TableField(value = "FINAL_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp finalTime;
    @TableField(value = "ORDER_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp orderTime;
    private byte isDelete;
    private long companyId;
    private int shopRealPay;
    private int tips;
    private String errorMsg;
    private int printNums;
    private long dyStoreId;
    private byte isPickComplete;
    private byte isUseInsurance;
    private byte isFinishCodeNeeded;
    private byte isDirectDelivery;
    private String riderRemark;
    private String greetingCard;
    private String postSource;
    private String giverPhone;
    private byte isOtherPlatforms;
    private byte isApplyCancel;
    @TableField(value = "APPLY_CANCEL_TIME", jdbcType = JdbcType.TIMESTAMP)
    private Timestamp applyCancelTime;
    private String toPhoneEnd;
    private int pickMethod;
    private long sourceDyOrderId;

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ",order_id=" + orderId +
                ",merchant_id=" + merchantId +
                ",dy_shop_id=" + dyShopId +
                ",shop_id=" + shopId +
                ",channel_id=" + channelId +
                ",status=" + status +
                ",order_index=" + orderIndex +
                ",order_type=" + orderType +
                ",latest_send_time=" + latestSendTime +
                ",to_name=" + toName +
                ",to_address=" + toAddress +
                ",to_address_detail=" + toAddressDetail +
                ",to_phone=" + toPhone +
                ",to_backup_phone=" + toBackupPhone +
                ",to_privacy_phone=" + toPrivacyPhone +
                ",to_lng=" + toLng +
                ",to_lat=" + toLat +
                ",goods_count=" + goodsCount +
                ",user_pay=" + userPay +
                ",total_fee=" + totalFee +
                ",shop_fee=" + shopFee +
                ",create_time=" + createTime +
                ",update_time=" + updateTime +
                ",version=" + version +
                ",weight=" + weight +
                ",package_fee=" + packageFee +
                ",delivery_type=" + deliveryType +
                ",remark=" + remark +
                ",subscribe_time=" + subscribeTime +
                ",shop_name=" + shopName +
                ",is_subscribe=" + isSubscribe +
                ",is_remind=" + isRemind +
                ",is_print=" + isPrint +
                ",is_cancel=" + isCancel +
                ",is_error=" + isError +
                ",is_new=" + isNew +
                ",is_dispatch=" + isDispatch +
                ",is_pickup=" + isPickup +
                ",is_deliver=" + isDeliver +
                ",is_history=" + isHistory +
                ",is_revise=" + isRevise +
                ",remind_time=" + remindTime +
                ",post_time=" + postTime +
                ",rider_time=" + riderTime +
                ",final_time=" + finalTime +
                ",order_time=" + orderTime +
                ",is_delete=" + isDelete +
                ",company_id=" + companyId +
                ",shop_real_pay=" + shopRealPay +
                ",tips=" + tips +
                ",error_msg=" + errorMsg +
                ",print_nums=" + printNums +
                ",dy_store_id=" + dyStoreId +
                ",is_pick_complete=" + isPickComplete +
                ",is_use_insurance=" + isUseInsurance +
                ",is_finish_code_needed=" + isFinishCodeNeeded +
                ",is_direct_delivery=" + isDirectDelivery +
                ",rider_remark=" + riderRemark +
                ",greeting_card=" + greetingCard +
                ",post_source=" + postSource +
                ",giver_phone=" + giverPhone +
                ",is_other_platforms=" + isOtherPlatforms +
                ",is_apply_cancel=" + isApplyCancel +
                ",apply_cancel_time=" + applyCancelTime +
                ",to_phone_end=" + toPhoneEnd +
                ",pick_method=" + pickMethod +
                ",source_dy_order_id=" + sourceDyOrderId +
                '}';
    }

    public long getid() {
        return id;
    }
}
