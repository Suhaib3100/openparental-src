package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.c1;
import fg.l;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: FileUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "Lkotlin/k2;", "a", "(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/FileChannel;)V", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "FileUtil")
@r1({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\nandroidx/room/util/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    @SuppressLint({"LambdaLast"})
    public static final void a(@l ReadableByteChannel input, @l FileChannel output) throws IOException {
        l0.p(input, "input");
        l0.p(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
