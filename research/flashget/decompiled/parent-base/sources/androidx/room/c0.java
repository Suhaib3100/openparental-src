package androidx.room;

import androidx.room.d0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Fts4.kt */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0013R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/room/c0;", "", "", "tokenizer", "", "tokenizerArgs", "Lkotlin/reflect/d;", "contentEntity", "languageId", "Landroidx/room/d0$a;", "matchInfo", "notIndexed", "", "prefix", "Landroidx/room/d0$b;", "order", "<init>", "(Ljava/lang/String;Lkotlin/Array;Lkotlin/reflect/d;Ljava/lang/String;Landroidx/room/d0$a;Lkotlin/Array;[ILandroidx/room/d0$b;)V", "()Ljava/lang/String;", "()[Ljava/lang/String;", "()Ljava/lang/Class;", "()Landroidx/room/d0$a;", "()[I", "()Landroidx/room/d0$b;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@androidx.annotation.x0(16)
@dd.f(allowedTargets = {dd.b.CLASS})
/* loaded from: classes3.dex */
public @interface c0 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    d0.a matchInfo() default d0.a.FTS4;

    String[] notIndexed() default {};

    d0.b order() default d0.b.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
