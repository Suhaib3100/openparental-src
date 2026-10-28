package com.github.penfeizhou.animation.webp.decode;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.io.Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WebPParser.java */
/* loaded from: classes5.dex */
public class m {

    /* compiled from: WebPParser.java */
    static class a extends IOException {
        a() {
            super(ProtectedSandApp.s("쒒"));
        }
    }

    public static boolean a(Context context, int i4) {
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i4);
            boolean c5 = c(new com.github.penfeizhou.animation.io.e(inputStream));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return c5;
        } catch (Exception unused) {
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean b(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            boolean c5 = c(new com.github.penfeizhou.animation.io.e(inputStream));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return c5;
        } catch (Exception unused) {
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean c(Reader reader) {
        com.github.penfeizhou.animation.webp.io.a aVar = reader instanceof com.github.penfeizhou.animation.webp.io.a ? (com.github.penfeizhou.animation.webp.io.a) reader : new com.github.penfeizhou.animation.webp.io.a(reader);
        try {
        } catch (IOException e4) {
            if (!(e4 instanceof a)) {
                e4.printStackTrace();
            }
        }
        if (!aVar.f(ProtectedSandApp.s("쒓"))) {
            return false;
        }
        aVar.skip(4L);
        if (!aVar.f(ProtectedSandApp.s("쒔"))) {
            return false;
        }
        while (aVar.available() > 0) {
            e f4 = f(aVar);
            if (f4 instanceof k) {
                return ((k) f4).e();
            }
        }
        return false;
    }

    public static boolean d(String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                boolean c5 = c(new com.github.penfeizhou.animation.io.e(fileInputStream2));
                try {
                    fileInputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return c5;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List<e> e(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        if (!aVar.f(ProtectedSandApp.s("쒓"))) {
            throw new a();
        }
        aVar.skip(4L);
        if (!aVar.f(ProtectedSandApp.s("쒔"))) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(f(aVar));
        }
        return arrayList;
    }

    static e f(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        int position = aVar.position();
        int b5 = aVar.b();
        int e4 = aVar.e();
        e kVar = k.f50891h == b5 ? new k() : b.f50859g == b5 ? new b() : c.f50862n == b5 ? new c() : com.github.penfeizhou.animation.webp.decode.a.f50858e == b5 ? new com.github.penfeizhou.animation.webp.decode.a() : i.f50889e == b5 ? new i() : j.f50890e == b5 ? new j() : g.f50887e == b5 ? new g() : n.f50899e == b5 ? new n() : f.f50886e == b5 ? new f() : new e();
        kVar.f50883a = b5;
        kVar.f50884b = e4;
        kVar.f50885c = position;
        kVar.c(aVar);
        return kVar;
    }
}
