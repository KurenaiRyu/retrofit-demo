package io.github.natsusai.retrofit.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kurenai
 * @since 2020-11-22 22:29
 */

@NoArgsConstructor
@Data
public class UserNavInfo {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"isLogin":true,"email_verified":1,"face":"http://i1.hdslb.com/bfs/face/aebb2639a0d47f2ce1fec0631f412eaf53d4a0be.jpg","level_info":{"current_level":5,"current_min":10800,"current_exp":17065,"next_exp":28800},"mid":293793435,"mobile_verified":1,"money":33.4,"moral":70,"official":{"role":0,"title":"","desc":"","type":-1},"officialVerify":{"type":-1,"desc":""},"pendant":{"pid":0,"name":"","image":"","expire":0,"image_enhance":""},"scores":0,"uname":"社会易姐QwQ","vipDueDate":1612454400000,"vipStatus":1,"vipType":2,"vip_pay_type":1,"vip_theme_type":0,"vip_label":{"path":"","text":"年度大会员","label_theme":"annual_vip"},"vip_avatar_subscript":1,"vip_nickname_color":"#FB7299","wallet":{"mid":293793435,"bcoin_balance":8,"coupon_balance":5,"coupon_due_time":0},"has_shop":false,"shop_url":"","allowance_count":0,"answer_status":0}
     */

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ttl")
    private Integer ttl;
    @JsonProperty("data")
    private Data data;

    @NoArgsConstructor
    @lombok.Data
    public static class Data {
        /**
         * isLogin : true
         * email_verified : 1
         * face : http://i1.hdslb.com/bfs/face/aebb2639a0d47f2ce1fec0631f412eaf53d4a0be.jpg
         * level_info : {"current_level":5,"current_min":10800,"current_exp":17065,"next_exp":28800}
         * mid : 293793435
         * mobile_verified : 1
         * money : 33.4
         * moral : 70
         * official : {"role":0,"title":"","desc":"","type":-1}
         * officialVerify : {"type":-1,"desc":""}
         * pendant : {"pid":0,"name":"","image":"","expire":0,"image_enhance":""}
         * scores : 0
         * uname : 社会易姐QwQ
         * vipDueDate : 1612454400000
         * vipStatus : 1
         * vipType : 2
         * vip_pay_type : 1
         * vip_theme_type : 0
         * vip_label : {"path":"","text":"年度大会员","label_theme":"annual_vip"}
         * vip_avatar_subscript : 1
         * vip_nickname_color : #FB7299
         * wallet : {"mid":293793435,"bcoin_balance":8,"coupon_balance":5,"coupon_due_time":0}
         * has_shop : false
         * shop_url :
         * allowance_count : 0
         * answer_status : 0
         */

        @JsonProperty("isLogin")
        private Boolean isLogin;
        @JsonProperty("email_verified")
        private Integer emailVerified;
        @JsonProperty("face")
        private String face;
        @JsonProperty("level_info")
        private LevelInfo levelInfo;
        @JsonProperty("mid")
        private Integer mid;
        @JsonProperty("mobile_verified")
        private Integer mobileVerified;
        @JsonProperty("money")
        private Double money;
        @JsonProperty("moral")
        private Integer moral;
        @JsonProperty("official")
        private Official official;
        @JsonProperty("officialVerify")
        private OfficialVerify officialVerify;
        @JsonProperty("pendant")
        private Pendant pendant;
        @JsonProperty("scores")
        private Integer scores;
        @JsonProperty("uname")
        private String uname;
        @JsonProperty("vipDueDate")
        private Long vipDueDate;
        @JsonProperty("vipStatus")
        private Integer vipStatus;
        @JsonProperty("vipType")
        private Integer vipType;
        @JsonProperty("vip_pay_type")
        private Integer vipPayType;
        @JsonProperty("vip_theme_type")
        private Integer vipThemeType;
        @JsonProperty("vip_label")
        private VipLabel vipLabel;
        @JsonProperty("vip_avatar_subscript")
        private Integer vipAvatarSubscript;
        @JsonProperty("vip_nickname_color")
        private String vipNicknameColor;
        @JsonProperty("wallet")
        private Wallet wallet;
        @JsonProperty("has_shop")
        private Boolean hasShop;
        @JsonProperty("shop_url")
        private String shopUrl;
        @JsonProperty("allowance_count")
        private Integer allowanceCount;
        @JsonProperty("answer_status")
        private Integer answerStatus;

        @NoArgsConstructor
        @lombok.Data
        public static class LevelInfo {
            /**
             * current_level : 5
             * current_min : 10800
             * current_exp : 17065
             * next_exp : 28800
             */

            @JsonProperty("current_level")
            private Integer currentLevel;
            @JsonProperty("current_min")
            private Integer currentMin;
            @JsonProperty("current_exp")
            private Integer currentExp;
            @JsonProperty("next_exp")
            private Integer nextExp;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class Official {
            /**
             * role : 0
             * title :
             * desc :
             * type : -1
             */

            @JsonProperty("role")
            private Integer role;
            @JsonProperty("title")
            private String title;
            @JsonProperty("desc")
            private String desc;
            @JsonProperty("type")
            private Integer type;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class OfficialVerify {
            /**
             * type : -1
             * desc :
             */

            @JsonProperty("type")
            private Integer type;
            @JsonProperty("desc")
            private String desc;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class Pendant {
            /**
             * pid : 0
             * name :
             * image :
             * expire : 0
             * image_enhance :
             */

            @JsonProperty("pid")
            private Integer pid;
            @JsonProperty("name")
            private String name;
            @JsonProperty("image")
            private String image;
            @JsonProperty("expire")
            private Integer expire;
            @JsonProperty("image_enhance")
            private String imageEnhance;
//            @JsonProperty("image_enhance_frame")
//            private String imageEnhanceFrame;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class VipLabel {
            /**
             * path :
             * text : 年度大会员
             * label_theme : annual_vip
             */

            @JsonProperty("path")
            private String path;
            @JsonProperty("text")
            private String text;
            @JsonProperty("label_theme")
            private String labelTheme;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class Wallet {
            /**
             * mid : 293793435
             * bcoin_balance : 8
             * coupon_balance : 5
             * coupon_due_time : 0
             */

            @JsonProperty("mid")
            private Integer mid;
            @JsonProperty("bcoin_balance")
            private Integer bcoinBalance;
            @JsonProperty("coupon_balance")
            private Integer couponBalance;
            @JsonProperty("coupon_due_time")
            private Integer couponDueTime;
        }
    }
}
