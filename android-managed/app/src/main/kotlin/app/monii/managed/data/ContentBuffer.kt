package app.monii.managed.data

import android.content.Context
import app.monii.managed.net.ContentItemDto
import app.monii.managed.net.EventInputDto
import java.time.Instant

/**
 * Shared content buffer for keyword detection data.
 *
 * Both SocialAppNotifListener and MoniiRepository write to and read from
 * the same file, so keyword detections are always routed correctly to
 * POST /content.
 */
object ContentBuffer {

    private const val FILENAME = "content_buffer.jsonl"

    /** Write a ContentItemDto to the shared content buffer. */
    fun add(context: Context, item: ContentItemDto) {
        EventBuffer(context.applicationContext, FILENAME).add(
            EventInputDto(
                type = "CONTENT",
                data = mapOf(
                    "source" to item.source,
                    "body" to item.body,
                    "matched" to item.matched,
                    "counterparty" to item.counterparty,
                    "occurredAt" to item.occurredAt,
                ),
                occurredAt = item.occurredAt,
            ),
        )
    }

    /** Drain and return all buffered content items. */
    fun drainAndClear(context: Context): List<EventInputDto> {
        return EventBuffer(context.applicationContext, FILENAME).drainAndClear()
    }

    /** Re-queue items whose upload failed. */
    fun readd(context: Context, items: List<EventInputDto>) {
        EventBuffer(context.applicationContext, FILENAME).readd(items)
    }

    /** Convenience — create a ContentItemDto with current timestamp. */
    fun createItem(
        source: String,
        body: String,
        matched: String?,
        counterparty: String? = null,
    ): ContentItemDto = ContentItemDto(
        source = source,
        body = body.take(512),
        matched = matched,
        counterparty = counterparty,
        occurredAt = Instant.now().toString(),
    )
}
