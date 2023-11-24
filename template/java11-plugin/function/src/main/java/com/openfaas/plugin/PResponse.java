package com.openfaas.plugin;

import cn.hutool.json.JSONUtil;
import com.openfaas.model.Response;

public class PResponse {
    /**
     * 错误信息，空表示没错误
     */
    private String error;
    /**
     * 回复类型 0:不回复,1:文本,2:图片,3:视频,4:文件
     */
    private int type;
    /**
     * 回复内容,type=1时为文本内容,type=2/3/4时为资源地址
     */
    private String body;
    /**
     * 文件名称
     */
    private String filename;

    public PResponse() {
    }

    public static PResponse noReply(String error) {
        return new PResponse();
    }

    public static PResponse error(String error) {
        PResponse response = new PResponse();
        response.setError(error);
        return response;
    }

    public static PResponse text(String body) {
        PResponse response = new PResponse();
        response.setType(1);
        response.setBody(body);
        return response;
    }

    public static PResponse image(String uri, String filename) {
        PResponse response = new PResponse();
        response.setType(2);
        response.setBody(uri);
        response.setFilename(filename);
        return response;
    }

    public static PResponse video(String uri, String filename) {
        PResponse response = new PResponse();
        response.setType(3);
        response.setBody(uri);
        response.setFilename(filename);
        return response;
    }

    public static PResponse file(String uri, String filename) {
        PResponse response = new PResponse();
        response.setType(4);
        response.setBody(uri);
        response.setFilename(filename);
        return response;
    }

    public Response toResponse() {
        Response res = new Response();
        res.setBody(JSONUtil.toJsonStr(this));
        res.setContentType("application/json");
        return res;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
