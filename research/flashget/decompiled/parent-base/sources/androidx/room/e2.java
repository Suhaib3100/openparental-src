package androidx.room;

import androidx.annotation.c1;
import kotlin.Metadata;

/* compiled from: RoomMasterTable.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Landroidx/room/e2;", "", "<init>", "()V", "", "hash", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Ljava/lang/String;", "TABLE_NAME", "c", "NAME", "d", "COLUMN_ID", "e", "COLUMN_IDENTITY_HASH", "f", "DEFAULT_ID", "g", "CREATE_QUERY", "h", "READ_QUERY", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String TABLE_NAME = "room_master_table";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String NAME = "room_master_table";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String COLUMN_ID = "id";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String COLUMN_IDENTITY_HASH = "identity_hash";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String DEFAULT_ID = "42";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e2 f33661a = new e2();

    private e2() {
    }

    @fg.l
    @kd.n
    public static final String a(@fg.l String hash) {
        kotlin.jvm.internal.l0.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
