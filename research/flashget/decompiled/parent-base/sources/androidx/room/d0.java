package androidx.room;

import kotlin.Metadata;

/* compiled from: FtsOptions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/room/d0;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "TOKENIZER_SIMPLE", "c", "TOKENIZER_PORTER", "d", "TOKENIZER_ICU", "e", "TOKENIZER_UNICODE61", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String TOKENIZER_SIMPLE = "simple";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String TOKENIZER_PORTER = "porter";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String TOKENIZER_ICU = "icu";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @androidx.annotation.x0(21)
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d0 f33572a = new d0();

    /* compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/d0$a;", "", "<init>", "(Ljava/lang/String;I)V", "FTS3", "FTS4", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        FTS3,
        FTS4
    }

    /* compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/d0$b;", "", "<init>", "(Ljava/lang/String;I)V", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        ASC,
        DESC
    }

    private d0() {
    }
}
