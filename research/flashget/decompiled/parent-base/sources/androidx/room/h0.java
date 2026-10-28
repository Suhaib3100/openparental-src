package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Index.kt */
@Target({})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B?\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/room/h0;", "", "", "", "value", "Landroidx/room/h0$a;", "orders", "name", "", "unique", "<init>", "(Lkotlin/Array;Lkotlin/Array;Ljava/lang/String;Z)V", "()[Ljava/lang/String;", "()[Landroidx/room/h0$a;", "()Ljava/lang/String;", "()Z", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {})
/* loaded from: classes3.dex */
public @interface h0 {

    /* compiled from: Index.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/h0$a;", "", "<init>", "(Ljava/lang/String;I)V", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        ASC,
        DESC
    }

    String name() default "";

    a[] orders() default {};

    boolean unique() default false;

    String[] value();
}
