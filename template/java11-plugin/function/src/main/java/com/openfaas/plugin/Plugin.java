package com.openfaas.plugin;

import cn.hutool.json.JSONUtil;
import com.openfaas.model.Response;

public class Plugin {
    private String keyword;
    private String description;

    public Plugin() {
    }

    public Plugin(String keyword, String description) {
        this.keyword = keyword;
        this.description = description;
    }
    public Response toResponse() {
        Response res = new Response();
        res.setBody(JSONUtil.toJsonStr(this));
        res.setContentType("application/json");
        return res;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
