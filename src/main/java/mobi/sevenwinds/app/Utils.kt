package mobi.sevenwinds.app

import org.joda.time.DateTime
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.util.*

fun LocalDateTime.toJodaDateTime(): DateTime {
    val instant = this.atZone(ZoneId.systemDefault()).toInstant()
    return DateTime(Date.from(instant))
}

fun DateTime.toLDT(): LocalDateTime {
    return LocalDateTime.ofEpochSecond(this.millis, 0, ZoneOffset.UTC)
}
