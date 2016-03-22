package com.jsqix.dq.turntableaward.bean;

/**
 * Created by dq on 2016/3/21.
 */
public class Bean {


    /**
     * code : 1000
     * data : {"username":null,"token":"ced6c2sTpL5Mw5b6FbGFXZz45PsAyOo5QxlPKL/7t185tg"}
     * msg : 登录成功
     * runTm : s：1458530796.27 e：1458530796.351 tms=9ms
     */

    private int code;
    /**
     * username : null
     * token : ced6c2sTpL5Mw5b6FbGFXZz45PsAyOo5QxlPKL/7t185tg
     */

    private DataEntity data;
    private String msg;
    private String runTm;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRunTm() {
        return runTm;
    }

    public void setRunTm(String runTm) {
        this.runTm = runTm;
    }

    public static class DataEntity {
        private String username;
        private String token;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
