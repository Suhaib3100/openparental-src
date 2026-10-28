package com.lyft.kronos.internal.ntp;

import com.lyft.kronos.internal.ntp.e;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: SntpResponseCache.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/lyft/kronos/internal/ntp/f;", "", "Lcom/lyft/kronos/internal/ntp/e$b;", "get", "()Lcom/lyft/kronos/internal/ntp/e$b;", "response", "Lkotlin/k2;", "a", "(Lcom/lyft/kronos/internal/ntp/e$b;)V", "clear", "()V", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface f {
    void a(@l e.b response);

    void clear();

    @m
    e.b get();
}
