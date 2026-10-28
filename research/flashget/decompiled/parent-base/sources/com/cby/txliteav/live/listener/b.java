package com.cby.txliteav.live.listener;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.cby.txliteav.live.e;
import com.cby.txliteav.live.n;
import com.cby.txliteav.live.t;
import fg.m;
import kotlin.Metadata;

/* compiled from: OnPlayerListener.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0010\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u0019\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001a\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u001a\u0010\u0013J!\u0010\u001c\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H&¢\u0006\u0004\b$\u0010%J+\u0010'\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b-\u0010(J#\u00100\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010.H&¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b4\u00105J+\u00109\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u00106\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000107H&¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/cby/txliteav/live/listener/b;", "", "Lb4/a;", "player", "", "code", "", "msg", "Landroid/os/Bundle;", "extraInfo", "Lkotlin/k2;", "d", "(Lb4/a;ILjava/lang/String;Landroid/os/Bundle;)V", "p", "width", "height", "l", "(Lb4/a;II)V", "b", "(Lb4/a;Landroid/os/Bundle;)V", "", "firstPlay", "n", "(Lb4/a;ZLandroid/os/Bundle;)V", "j", "o", "k", "volume", "q", "(Lb4/a;I)V", "Lcom/cby/txliteav/live/n;", "statistics", "h", "(Lb4/a;Lcom/cby/txliteav/live/n;)V", "Landroid/graphics/Bitmap;", "image", "m", "(Lb4/a;Landroid/graphics/Bitmap;)V", "storagePath", "g", "(Lb4/a;ILjava/lang/String;)V", "", "durationMs", "a", "(Lb4/a;JLjava/lang/String;)V", "r", "Lcom/cby/txliteav/live/t;", "videoFrame", "e", "(Lb4/a;Lcom/cby/txliteav/live/t;)V", "Lcom/cby/txliteav/live/e;", "audioFrame", "c", "(Lb4/a;Lcom/cby/txliteav/live/e;)V", "payloadType", "", "data", "f", "(Lb4/a;I[B)V", "url", "i", "(Lb4/a;Ljava/lang/String;I)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {
    void a(@m b4.a player, long durationMs, @m String storagePath);

    void b(@m b4.a player, @m Bundle extraInfo);

    void c(@m b4.a player, @m e audioFrame);

    void d(@m b4.a player, int code, @m String msg, @m Bundle extraInfo);

    void e(@m b4.a player, @m t videoFrame);

    void f(@m b4.a player, int payloadType, @m byte[] data);

    void g(@m b4.a player, int code, @m String storagePath);

    void h(@m b4.a player, @m n statistics);

    void i(@m b4.a player, @m String url, int code);

    void j(@m b4.a player, boolean firstPlay, @m Bundle extraInfo);

    void k(@m b4.a player, @m Bundle extraInfo);

    void l(@m b4.a player, int width, int height);

    void m(@m b4.a player, @m Bitmap image);

    void n(@m b4.a player, boolean firstPlay, @m Bundle extraInfo);

    void o(@m b4.a player, @m Bundle extraInfo);

    void p(@m b4.a player, int code, @m String msg, @m Bundle extraInfo);

    void q(@m b4.a player, int volume);

    void r(@m b4.a player, int code, @m String storagePath);
}
