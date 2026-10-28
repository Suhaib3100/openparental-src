package com.github.penfeizhou.animation.apng.decode;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.io.Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: APNGParser.java */
/* loaded from: classes5.dex */
public class d {

    /* compiled from: APNGParser.java */
    static class a extends IOException {
        a() {
            super(ProtectedSandApp.s("쑭"));
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
        com.github.penfeizhou.animation.apng.io.a aVar = reader instanceof com.github.penfeizhou.animation.apng.io.a ? (com.github.penfeizhou.animation.apng.io.a) reader : new com.github.penfeizhou.animation.apng.io.a(reader);
        try {
            if (!aVar.a(ProtectedSandApp.s("쑮")) || !aVar.a(ProtectedSandApp.s("쑯"))) {
                throw new a();
            }
            while (aVar.available() > 0) {
                if (f(aVar) instanceof com.github.penfeizhou.animation.apng.decode.a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e4) {
            if (e4 instanceof a) {
                return false;
            }
            e4.printStackTrace();
            return false;
        }
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

    public static List<e> e(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        if (!aVar.a(ProtectedSandApp.s("쑮")) || !aVar.a(ProtectedSandApp.s("쑯"))) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(f(aVar));
        }
        return arrayList;
    }

    private static e f(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        int position = aVar.position();
        int c5 = aVar.c();
        int b5 = aVar.b();
        e aVar2 = b5 == com.github.penfeizhou.animation.apng.decode.a.f50706g ? new com.github.penfeizhou.animation.apng.decode.a() : b5 == f.f50727n ? new f() : b5 == g.f50742f ? new g() : b5 == h.f50744e ? new h() : b5 == i.f50745e ? new i() : b5 == j.f50746h ? new j() : new e();
        aVar2.f50726d = position;
        aVar2.f50724b = b5;
        aVar2.f50723a = c5;
        aVar2.c(aVar);
        aVar2.f50725c = aVar.c();
        return aVar2;
    }
}
