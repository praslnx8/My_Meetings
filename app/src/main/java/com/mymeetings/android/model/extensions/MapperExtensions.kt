package com.mymeetings.android.model.extensions

import com.mymeetings.android.db.CalendarEventDbModel
import com.mymeetings.android.model.CalendarEvent

fun CalendarEvent.toDbModel() = CalendarEventDbModel(
    id = this.id,
    title = this.title,
    startTime = this.startTime,
    endTime = this.endTime,
    isDone = this.isDeleted
)

fun CalendarEventDbModel.toDomainModel() = CalendarEvent(
    id = this.id,
    title = this.title,
    startTime = this.startTime,
    endTime = this.endTime,
    isDeleted = this.isDone
)

fun List<CalendarEvent>.toDbModelCollection() = this.map { it.toDbModel() }

fun List<CalendarEventDbModel>.toDomainModelCollection() = this.map { it.toDomainModel() }