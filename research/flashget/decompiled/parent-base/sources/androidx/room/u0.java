package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: OnConflictStrategy.kt */
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/u0;", "", "<init>", "()V", "D", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public @interface u0 {

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f33942a;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 4;
    public static final int J = 5;

    /* compiled from: OnConflictStrategy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u0005\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/room/u0$a;", "", "<init>", "()V", "", "b", "I", "NONE", "c", "REPLACE", "d", "ROLLBACK", "e", "ABORT", "f", "a", "FAIL", "g", "IGNORE", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.u0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f33942a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int NONE = 0;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int REPLACE = 1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int ROLLBACK = 2;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int ABORT = 3;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int FAIL = 4;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int IGNORE = 5;

        private Companion() {
        }

        @kotlin.k(message = "Use ABORT instead.")
        public static /* synthetic */ void a() {
        }

        @kotlin.k(message = "Use ABORT instead.")
        public static /* synthetic */ void b() {
        }
    }
}
