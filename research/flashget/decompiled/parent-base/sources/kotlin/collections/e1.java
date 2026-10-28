package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Maps.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a]\u0010\b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a_\u0010\n\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a=\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00120\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001aw\u0010\u0017\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0014*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0016\u001a\u00028\u00032$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aw\u0010\u0019\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0014*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0016\u001a\u00028\u00032$\u0010\u0007\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00120\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001a]\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011\u001ac\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0011\u001aw\u0010\u001c\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002\"\u0010\b\u0003\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0014*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0016\u001a\u00028\u00032 \u0010\u0007\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018\u001aq\u0010\u001d\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003\"\u0010\b\u0003\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0014*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0016\u001a\u00028\u00032\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018\u001aQ\u0010 \u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a+\u0010\"\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\"\u0010#\u001aQ\u0010$\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010!\u001a.\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b¢\u0006\u0004\b&\u0010'\u001aQ\u0010(\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aQ\u0010,\u001a\u00020*\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020*0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001am\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001ao\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00101\u001aQ\u00104\u001a\u000203\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aQ\u00107\u001a\u000206\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001aa\u00109\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aS\u0010;\u001a\u0004\u0018\u000103\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001aS\u0010=\u001a\u0004\u0018\u000106\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001ac\u0010?\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b?\u0010:\u001as\u0010C\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020@j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`A2\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001au\u0010E\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020@j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`A2\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bE\u0010D\u001an\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010B\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060@j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`AH\u0087\b¢\u0006\u0004\bF\u0010G\u001ap\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010B\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060@j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`AH\u0087\b¢\u0006\u0004\bH\u0010G\u001am\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bI\u00101\u001ao\u0010J\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u00101\u001aQ\u0010K\u001a\u000203\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u00105\u001aQ\u0010L\u001a\u000206\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bL\u00108\u001aa\u0010M\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bM\u0010:\u001aS\u0010N\u001a\u0004\u0018\u000103\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bN\u0010<\u001aS\u0010O\u001a\u0004\u0018\u000106\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u0002060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bO\u0010>\u001ac\u0010P\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020.*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bP\u0010:\u001as\u0010Q\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020@j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`A2\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010D\u001au\u0010R\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020@j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`A2\u001e\u0010/\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010D\u001an\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010B\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060@j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`AH\u0087\b¢\u0006\u0004\bS\u0010G\u001ap\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010B\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060@j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`AH\u0087\b¢\u0006\u0004\bT\u0010G\u001a+\u0010U\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\bU\u0010#\u001aQ\u0010V\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\bV\u0010!\u001a[\u0010X\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010W*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u00028\u00022\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020*0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001ap\u0010^\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010W*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u00028\u000223\u0010+\u001a/\u0012\u0013\u0012\u00110%¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(]\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00020*0ZH\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a@\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b¢\u0006\u0004\b`\u0010a\u001a=\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"K", "V", "", "R", "", "Lkotlin/Function1;", "", "transform", "W0", "(Ljava/util/Map;Lld/l;)Ljava/lang/Object;", "X0", "", "Lkotlin/q0;", "J1", "(Ljava/util/Map;)Ljava/util/List;", "", "Y0", "(Ljava/util/Map;Lld/l;)Ljava/util/List;", "Lkotlin/sequences/m;", "Z0", "", "C", "destination", "b1", "(Ljava/util/Map;Ljava/util/Collection;Lld/l;)Ljava/util/Collection;", "a1", "d1", "e1", "f1", "g1", "", "predicate", "P0", "(Ljava/util/Map;Lld/l;)Z", "Q0", "(Ljava/util/Map;)Z", "R0", "", "U0", "(Ljava/util/Map;)I", "V0", "(Ljava/util/Map;Lld/l;)I", "Lkotlin/k2;", "action", "c1", "(Ljava/util/Map;Lld/l;)V", "", "selector", "i1", "(Ljava/util/Map;Lld/l;)Ljava/util/Map$Entry;", "h1", "", "j1", "(Ljava/util/Map;Lld/l;)D", "", "k1", "(Ljava/util/Map;Lld/l;)F", "l1", "(Ljava/util/Map;Lld/l;)Ljava/lang/Comparable;", "n1", "(Ljava/util/Map;Lld/l;)Ljava/lang/Double;", "o1", "(Ljava/util/Map;Lld/l;)Ljava/lang/Float;", "m1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "p1", "(Ljava/util/Map;Ljava/util/Comparator;Lld/l;)Ljava/lang/Object;", "q1", "s1", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;", "r1", "u1", "t1", "v1", "w1", "x1", "z1", "A1", "y1", "B1", "C1", "E1", "D1", "F1", "G1", "M", "H1", "(Ljava/util/Map;Lld/l;)Ljava/util/Map;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "index", "I1", "(Ljava/util/Map;Lld/p;)Ljava/util/Map;", "S0", "(Ljava/util/Map;)Ljava/lang/Iterable;", "T0", "(Ljava/util/Map;)Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* loaded from: classes7.dex */
public class e1 extends d1 {
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> Float A1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.invoke((Object) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.invoke((Object) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        return (Map.Entry) g0.n4(map.entrySet(), comparator);
    }

    @kotlin.c1(version = "1.7")
    @kd.i(name = "minWithOrThrow")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        return (Map.Entry) g0.o4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慀\u0001"));
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@fg.l M m4, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慁\u0001"));
        Iterator<Map.Entry<K, V>> it = m4.entrySet().iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
        return m4;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@fg.l M m4, @fg.l ld.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, k2> pVar) {
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("慁\u0001"));
        Iterator<T> it = m4.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            a0.c cVar = (Object) it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                y.Z();
            }
            pVar.invoke(Integer.valueOf(i4), cVar);
            i4 = i5;
        }
        return m4;
    }

    @fg.l
    public static <K, V> List<kotlin.q0<K, V>> J1(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        if (map.size() == 0) {
            return j0.f74919b;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return j0.f74919b;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return x.k(new kotlin.q0(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new kotlin.q0(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new kotlin.q0(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慀\u0001"));
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!lVar.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慀\u0001"));
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.internal.f
    private static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        return map.entrySet();
    }

    @fg.l
    public static <K, V> kotlin.sequences.m<Map.Entry<K, V>> T0(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        return g0.A1(map.entrySet());
    }

    @kotlin.internal.f
    private static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        return map.size();
    }

    public static final <K, V> int V0(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慀\u0001"));
        int i4 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <K, V, R> R W0(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        R r4;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r4 = null;
                break;
            }
            r4 = lVar.invoke(it.next());
            if (r4 != null) {
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("慃\u0001"));
    }

    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <K, V, R> R X0(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R invoke = lVar.invoke(it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @fg.l
    public static final <K, V, R> List<R> Y0(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            d0.q0(arrayList, lVar.invoke(it.next()));
        }
        return arrayList;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    @kd.i(name = "flatMapSequence")
    @kotlin.p0
    public static final <K, V, R> List<R> Z0(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            d0.r0(arrayList, lVar.invoke(it.next()));
        }
        return arrayList;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    @kd.i(name = "flatMapSequenceTo")
    @kotlin.p0
    public static final <K, V, R, C extends Collection<? super R>> C a1(@fg.l Map<? extends K, ? extends V> map, @fg.l C c5, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("慄\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            d0.r0(c5, lVar.invoke(it.next()));
        }
        return c5;
    }

    @fg.l
    public static final <K, V, R, C extends Collection<? super R>> C b1(@fg.l Map<? extends K, ? extends V> map, @fg.l C c5, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("慄\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            d0.q0(c5, lVar.invoke(it.next()));
        }
        return c5;
    }

    @kotlin.internal.e
    public static final <K, V> void c1(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慁\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    @fg.l
    public static final <K, V, R> List<R> d1(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.invoke(it.next()));
        }
        return arrayList;
    }

    @fg.l
    public static final <K, V, R> List<R> e1(@fg.l Map<? extends K, ? extends V> map, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R invoke = lVar.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @fg.l
    public static final <K, V, R, C extends Collection<? super R>> C f1(@fg.l Map<? extends K, ? extends V> map, @fg.l C c5, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("慄\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R invoke = lVar.invoke(it.next());
            if (invoke != null) {
                c5.add(invoke);
            }
        }
        return c5;
    }

    @fg.l
    public static final <K, V, R, C extends Collection<? super R>> C g1(@fg.l Map<? extends K, ? extends V> map, @fg.l C c5, @fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("慄\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慂\u0001"));
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c5.add(lVar.invoke(it.next()));
        }
        return c5;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = lVar.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = lVar.invoke(entry3);
                    if (invoke.compareTo(invoke2) < 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.c1(version = "1.7")
    @kd.i(name = "maxByOrThrow")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R invoke = lVar.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R invoke2 = lVar.invoke(entry2);
                if (invoke.compareTo(invoke2) < 0) {
                    entry = entry2;
                    invoke = invoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> double j1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke((Object) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> float k1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke((Object) it.next()).floatValue());
        }
        return floatValue;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> Double n1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> Float o1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.invoke((Object) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) lVar.invoke((Object) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        return (Map.Entry) g0.V3(map.entrySet(), comparator);
    }

    @kotlin.c1(version = "1.7")
    @kd.i(name = "maxWithOrThrow")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愿\u0001"));
        return (Map.Entry) g0.W3(map.entrySet(), comparator);
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = lVar.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = lVar.invoke(entry3);
                    if (invoke.compareTo(invoke2) > 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.c1(version = "1.7")
    @kd.i(name = "minByOrThrow")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R invoke = lVar.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R invoke2 = lVar.invoke(entry2);
                if (invoke.compareTo(invoke2) > 0) {
                    entry = entry2;
                    invoke = invoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> double v1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke((Object) it.next()).doubleValue());
        }
        return doubleValue;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> float w1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke((Object) it.next()).floatValue());
        }
        return floatValue;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = lVar.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    @kotlin.p0
    private static final <K, V> Double z1(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愽\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愾\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}
