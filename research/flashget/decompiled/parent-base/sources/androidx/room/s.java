package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: DeleteTable.kt */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/room/s;", "", "", "tableName", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.CLASS})
/* loaded from: classes3.dex */
public @interface s {

    /* compiled from: DeleteTable.kt */
    @Target({ElementType.TYPE})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/s$a;", "", "", "Landroidx/room/s;", "value", "<init>", "(Lkotlin/Array;)V", "()[Landroidx/room/s;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @dd.f(allowedTargets = {dd.b.CLASS})
    public @interface a {
        s[] value();
    }

    String tableName();
}
