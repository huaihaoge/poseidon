package com.haochh.chen.poseidon.bean;

import java.util.List;

/**
 * Created by admin on 2019/5/26.
 */
public class ListFish {

    /**
     * reason : 成功的返回
     * result :
     * error_code : 0
     */

    private String reason;
    private ResultEntity result;
    private int error_code;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getError_code() {
        return error_code;
    }

    public static class ResultEntity {
        /**
         * stat : 1
         * data : [{...}]
         */

        private List<Fishs> data;


        public void setData(List<Fishs> data) {
            this.data = data;
        }

        public List<Fishs> getData() {
            return data;
        }
    }
}
