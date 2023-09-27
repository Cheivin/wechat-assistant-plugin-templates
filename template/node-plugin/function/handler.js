'use strict'

const response = require('./response');

module.exports = {
    info: async function () {
        return response.plugin("唤醒词", "描述")
    },

    handle: async function (request) {
        return response.text(request.message)
    },
}
