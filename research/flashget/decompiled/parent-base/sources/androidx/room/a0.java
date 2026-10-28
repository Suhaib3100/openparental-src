package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ForeignKey.kt */
@Target({})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0002\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BM\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/room/a0;", "", "Lkotlin/reflect/d;", "entity", "", "", "parentColumns", "childColumns", "", "onDelete", "onUpdate", "", "deferred", "<init>", "(Lkotlin/reflect/d;Lkotlin/Array;Lkotlin/Array;IIZ)V", "()Ljava/lang/Class;", "()[Ljava/lang/String;", "()I", "()Z", "x", "a", "b", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {})
/* loaded from: classes3.dex */
public @interface a0 {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f33512a;

    /* renamed from: y, reason: collision with root package name */
    public static final int f33510y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f33511z = 2;

    /* compiled from: ForeignKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/a0$a;", "", "<init>", "()V", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* compiled from: ForeignKey.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/room/a0$b;", "", "<init>", "()V", "", "b", "I", "NO_ACTION", "c", "RESTRICT", "d", "SET_NULL", "e", "SET_DEFAULT", "f", "CASCADE", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.a0$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f33512a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int NO_ACTION = 1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int RESTRICT = 2;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int SET_NULL = 3;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int SET_DEFAULT = 4;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int CASCADE = 5;

        private Companion() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}
