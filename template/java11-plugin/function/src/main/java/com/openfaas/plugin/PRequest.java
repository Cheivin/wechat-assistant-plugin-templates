package com.openfaas.plugin;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.openfaas.model.IRequest;

public class PRequest {
    private transient IRequest request;

    private String msgID;
    private String uid;
    private String username;
    private String gid;
    private String groupName;
    private String message;
    private String rawMessage;
    private int msgType;
    private long time;

    public PRequest() {
    }

    public static PRequest parse(IRequest request) {
        PRequest req = new PRequest();
        req.setRequest(request);
        JSONObject json = JSONUtil.parseObj(request.getBody());
        req.setMsgID(json.getStr("msgID"));
        req.setUid(json.getStr("uid"));
        req.setUsername(json.getStr("username"));
        req.setGid(json.getStr("gid"));
        req.setGroupName(json.getStr("groupName"));
        req.setMessage(json.getStr("message"));
        req.setRawMessage(json.getStr("rawMessage"));
        req.setMsgType(json.getInt("msgType"));
        req.setTime(json.getLong("time"));
        return req;
    }

    public IRequest getRequest() {
        return request;
    }

    public void setRequest(IRequest request) {
        this.request = request;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRawMessage() {
        return rawMessage;
    }

    public void setRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
