'use strict'

module.exports = {
    plugin: function (keyword, description) {
        return {keyword: keyword || "", description: description || ""}
    },
    noReply: function () {
        return {type: 0}
    },
    error: function (error) {
        return {error: error, type: 0}
    },
    text: function (body) {
        return {error: "", type: 1, body: body}
    },
    image: function (src, filename) {
        return {error: "", type: 1, body: src, filename: filename || ''}
    },
    file: function (src, filename) {
        return {error: "", type: 2, body: src, filename: filename || ''}
    },
}
