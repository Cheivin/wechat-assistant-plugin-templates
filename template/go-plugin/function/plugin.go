package function

import (
	"encoding/json"
	handler "github.com/openfaas/templates-sdk/go-http"
)

type (
	// Plugin 插件信息
	Plugin struct {
		Keyword     string `json:"keyword"`     // 默认唤醒词
		Description string `json:"description"` // 插件说明
	}
	Request struct {
		Request *handler.Request `json:"-"`

		MsgID      string      `json:"msgID"`
		UID        string      `json:"uid"`
		Username   string      `json:"username"`
		GID        string      `json:"gid"`
		GroupName  string      `json:"groupName"`
		Message    string      `json:"message"`
		RawMessage string      `json:"rawMessage"`
		MsgType    json.Number `json:"msgType"`
		Time       json.Number `json:"time"`
	}
	Response struct {
		Error    string  `json:"error"`    // 错误信息，空表示没错误
		Type     MsgType `json:"type"`     // 回复类型 0:不回复,1:文本,2:图片,3:视频,4:文件
		Body     string  `json:"body"`     // 回复内容,type=1时为文本内容,type=2/3/4时为资源地址
		Filename string  `json:"filename"` // 文件名称
	}
	MsgType int
)

const (
	NoReply MsgType = iota
	Text
	Image
	Video
	File
)
