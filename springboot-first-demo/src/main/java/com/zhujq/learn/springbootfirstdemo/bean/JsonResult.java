/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: JsonResult
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 17:42
 */

package com.zhujq.learn.springbootfirstdemo.bean;

/**
 *
 * 通用json返回类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
public class JsonResult {
    private String status = null;
    private Object result = null;
    public JsonResult status(String status){
        this.status = status;
        return  this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }
}
