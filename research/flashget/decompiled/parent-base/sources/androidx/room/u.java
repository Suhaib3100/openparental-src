package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Entity.kt */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/room/u;", "", "", "tableName", "", "Landroidx/room/h0;", "indices", "", "inheritSuperIndices", "primaryKeys", "Landroidx/room/a0;", "foreignKeys", "ignoredColumns", "<init>", "(Ljava/lang/String;Lkotlin/Array;ZLkotlin/Array;Lkotlin/Array;Lkotlin/Array;)V", "()Ljava/lang/String;", "()[Landroidx/room/h0;", "()Z", "()[Ljava/lang/String;", "()[Landroidx/room/a0;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.CLASS})
/* loaded from: classes3.dex */
public @interface u {
    a0[] foreignKeys() default {};

    String[] ignoredColumns() default {};

    h0[] indices() default {};

    boolean inheritSuperIndices() default false;

    String[] primaryKeys() default {};

    String tableName() default "";
}
