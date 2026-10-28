package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.c1;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.content.res.f;
import androidx.core.provider.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: TypefaceCompatApi29Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@androidx.annotation.x0(29)
/* loaded from: classes3.dex */
public class a1 extends b1 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26169d = "TypefaceCompatApi29Impl";

    private Font p(@androidx.annotation.o0 FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? w.h.f22554j : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int r4 = r(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int r5 = r(fontStyle, font2.getStyle());
            if (r5 < r4) {
                font = font2;
                r4 = r5;
            }
        }
        return font;
    }

    @androidx.annotation.q0
    private static FontFamily q(@androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, ContentResolver contentResolver) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        int length = cVarArr.length;
        FontFamily.Builder builder = null;
        while (i4 < length) {
            q.c cVar = cVarArr[i4];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
            } catch (IOException unused) {
                continue;
            }
            if (openFileDescriptor == null) {
                i4 = openFileDescriptor == null ? i4 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static int r(@androidx.annotation.o0 FontStyle fontStyle, @androidx.annotation.o0 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (f.e eVar : dVar.a()) {
                try {
                    Font build = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(p(build2, i4).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface d(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        try {
            FontFamily q4 = q(cancellationSignal, cVarArr, context.getContentResolver());
            if (q4 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(q4).setStyle(p(q4, i4).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface e(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 List<q.c[]> list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily q4 = q(cancellationSignal, list.get(0), contentResolver);
            if (q4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(q4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily q5 = q(cancellationSignal, list.get(i5), contentResolver);
                if (q5 != null) {
                    customFallbackBuilder.addCustomFallback(q5);
                }
            }
            return customFallbackBuilder.setStyle(p(q4, i4).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.b1
    protected Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface g(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.o0
    Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        return Typeface.create(typeface, i4, z4);
    }

    @Override // androidx.core.graphics.b1
    protected q.c m(q.c[] cVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
