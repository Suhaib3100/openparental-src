package com.lyft.kronos.internal.ntp;

import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: SntpService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\u0007J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/lyft/kronos/internal/ntp/h;", "", "", "e", "()J", "Lkotlin/k2;", "d", "()V", "", "b", "()Z", "shutdown", "Lhb/g;", "c", "()Lhb/g;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface h {

    /* compiled from: SntpService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static long a(@l h hVar) {
            hb.g c5 = hVar.c();
            if (c5 != null) {
                return c5.e();
            }
            return 0L;
        }
    }

    boolean b();

    @m
    hb.g c();

    void d();

    long e();

    void shutdown();
}
