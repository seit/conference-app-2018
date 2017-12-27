package io.github.droidkaigi.confsched2018.model

data class Session(
        var id: String,
        var title: String,
        var desc: String,
        var startTime: Date,
        var endTime: Date,
        var room: Room,
        var format: String,
        var sessionFormat: String,
        var language: String,
        var topic: Topic,
        var level: Level,
        var isFavorited: Boolean,
        var speakers: List<Speaker>
)