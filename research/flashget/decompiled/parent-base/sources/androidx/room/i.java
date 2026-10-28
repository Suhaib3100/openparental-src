package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ColumnInfo.kt */
@Target({ElementType.FIELD, ElementType.METHOD})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/room/i;", "", "", "name", "", "typeAffinity", "", "index", "collate", "defaultValue", "<init>", "(Ljava/lang/String;IZILjava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Z", "j", "a", "b", "c", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.FIELD, dd.b.FUNCTION})
/* loaded from: classes3.dex */
public @interface i {

    /* renamed from: l, reason: collision with root package name */
    public static final int f33709l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f33710m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f33711n = 3;

    /* renamed from: o, reason: collision with root package name */
    public static final int f33712o = 4;

    /* renamed from: p, reason: collision with root package name */
    public static final int f33713p = 5;

    /* renamed from: q, reason: collision with root package name */
    public static final int f33714q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f33715r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f33716s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f33717t = 4;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.x0(21)
    public static final int f33718u = 5;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.x0(21)
    public static final int f33719v = 6;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    public static final String f33720w = "[value-unspecified]";

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    public static final String f33708k = "[field-name]";

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f33721a;

    /* compiled from: ColumnInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/i$a;", "", "<init>", "()V", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @androidx.annotation.x0(21)
    public @interface a {
    }

    /* compiled from: ColumnInfo.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006¨\u0006\""}, d2 = {"Landroidx/room/i$b;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "INHERIT_FIELD_NAME", "", "c", "I", "UNDEFINED", "d", "TEXT", "e", "INTEGER", "f", "REAL", "g", "BLOB", "h", "UNSPECIFIED", "i", "BINARY", "j", "NOCASE", "k", "RTRIM", "l", "LOCALIZED", "m", "UNICODE", "n", "VALUE_UNSPECIFIED", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.i$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int UNDEFINED = 1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int TEXT = 2;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int INTEGER = 3;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int REAL = 4;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int BLOB = 5;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final int UNSPECIFIED = 1;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final int BINARY = 2;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final int NOCASE = 3;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        public static final int RTRIM = 4;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.x0(21)
        public static final int LOCALIZED = 5;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.x0(21)
        public static final int UNICODE = 6;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final String INHERIT_FIELD_NAME = "[field-name]";

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f33721a = new Companion();

        private Companion() {
        }
    }

    /* compiled from: ColumnInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/i$c;", "", "<init>", "()V", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @c
    int typeAffinity() default 1;
}
