package com.google.android.gms.common.server.response;

import androidx.annotation.q0;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zac implements zai<Float> {
    zac() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    @q0
    public final /* synthetic */ Float zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return Float.valueOf(zak);
    }
}
