package com.tencent.cos.xml.transfer;

import android.util.Xml;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.AccelerateConfiguration;
import com.tencent.cos.xml.model.tag.AccessControlPolicy;
import com.tencent.cos.xml.model.tag.BucketLoggingStatus;
import com.tencent.cos.xml.model.tag.CORSConfiguration;
import com.tencent.cos.xml.model.tag.DeleteResult;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import com.tencent.cos.xml.model.tag.InventoryConfiguration;
import com.tencent.cos.xml.model.tag.LifecycleConfiguration;
import com.tencent.cos.xml.model.tag.ListBucket;
import com.tencent.cos.xml.model.tag.ListBucketVersions;
import com.tencent.cos.xml.model.tag.ListInventoryConfiguration;
import com.tencent.cos.xml.model.tag.ListVersionResult;
import com.tencent.cos.xml.model.tag.LocationConstraint;
import com.tencent.cos.xml.model.tag.ReplicationConfiguration;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.cos.xml.model.tag.VersioningConfiguration;
import com.tencent.cos.xml.model.tag.WebsiteConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class XmlParser extends XmlSlimParser {
    public static void parseAccelerateConfiguration(InputStream inputStream, AccelerateConfiguration accelerateConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (ProtectedSandApp.s("偾\u0001").equalsIgnoreCase(name)) {
                    newPullParser.next();
                    accelerateConfiguration.status = newPullParser.getText();
                } else if (ProtectedSandApp.s("偿\u0001").equalsIgnoreCase(name)) {
                    newPullParser.next();
                    accelerateConfiguration.type = newPullParser.getText();
                }
            }
        }
    }

    public static void parseAccessControlPolicy(InputStream inputStream, AccessControlPolicy accessControlPolicy) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        AccessControlPolicy.AccessControlList accessControlList = new AccessControlPolicy.AccessControlList();
        accessControlPolicy.accessControlList = accessControlList;
        accessControlList.grants = new ArrayList();
        AccessControlPolicy.Owner owner = null;
        AccessControlPolicy.Grant grant = null;
        AccessControlPolicy.Grantee grantee = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傀\u0001");
            String s5 = ProtectedSandApp.s("傁\u0001");
            String s6 = ProtectedSandApp.s("傂\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s6)) {
                    owner = new AccessControlPolicy.Owner();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.f71723id = newPullParser.getText();
                    } else if (grantee != null) {
                        grantee.f71722id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傄\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.displayName = newPullParser.getText();
                    } else if (grantee != null) {
                        grantee.displayName = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    grant = new AccessControlPolicy.Grant();
                } else if (name.equalsIgnoreCase(s4)) {
                    grantee = new AccessControlPolicy.Grantee();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傅\u0001"))) {
                    newPullParser.next();
                    if (grantee != null) {
                        grantee.uri = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傆\u0001"))) {
                    newPullParser.next();
                    if (grant != null) {
                        grant.permission = newPullParser.getText();
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s6)) {
                    accessControlPolicy.owner = owner;
                    owner = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    accessControlPolicy.accessControlList.grants.add(grant);
                    grant = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    if (grant != null) {
                        grant.grantee = grantee;
                    }
                    grantee = null;
                }
            }
        }
    }

    public static void parseBucketLoggingStatus(InputStream inputStream, BucketLoggingStatus bucketLoggingStatus) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        BucketLoggingStatus.LoggingEnabled loggingEnabled = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傇\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s4)) {
                    loggingEnabled = new BucketLoggingStatus.LoggingEnabled();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傈\u0001"))) {
                    newPullParser.next();
                    if (loggingEnabled != null) {
                        loggingEnabled.targetBucket = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傉\u0001"))) {
                    newPullParser.next();
                    if (loggingEnabled != null) {
                        loggingEnabled.targetPrefix = newPullParser.getText();
                    }
                }
            } else if (eventType == 3 && newPullParser.getName().equalsIgnoreCase(s4)) {
                bucketLoggingStatus.loggingEnabled = loggingEnabled;
                loggingEnabled = null;
            }
        }
    }

    public static void parseCORSConfiguration(InputStream inputStream, CORSConfiguration cORSConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        cORSConfiguration.corsRules = new ArrayList();
        CORSConfiguration.CORSRule cORSRule = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傊\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s4)) {
                    cORSRule = new CORSConfiguration.CORSRule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null) {
                        cORSRule.f71724id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傋\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null) {
                        cORSRule.allowedOrigin = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傌\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null && cORSRule.allowedMethod == null) {
                        cORSRule.allowedMethod = new ArrayList();
                    }
                    if (cORSRule != null) {
                        cORSRule.allowedMethod.add(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傍\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null && cORSRule.allowedHeader == null) {
                        cORSRule.allowedHeader = new ArrayList();
                    }
                    if (cORSRule != null) {
                        cORSRule.allowedHeader.add(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傎\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null && cORSRule.exposeHeader == null) {
                        cORSRule.exposeHeader = new ArrayList();
                    }
                    if (cORSRule != null) {
                        cORSRule.exposeHeader.add(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傏\u0001"))) {
                    newPullParser.next();
                    if (cORSRule != null) {
                        cORSRule.maxAgeSeconds = Integer.parseInt(newPullParser.getText());
                    }
                }
            } else if (eventType == 3 && newPullParser.getName().equalsIgnoreCase(s4)) {
                cORSConfiguration.corsRules.add(cORSRule);
                cORSRule = null;
            }
        }
    }

    public static void parseDeleteResult(InputStream inputStream, DeleteResult deleteResult) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        deleteResult.errorList = new ArrayList();
        deleteResult.deletedList = new ArrayList();
        DeleteResult.Deleted deleted = null;
        DeleteResult.Error error = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傐\u0001");
            String s5 = ProtectedSandApp.s("傑\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s5)) {
                    deleted = new DeleteResult.Deleted();
                } else if (name.equalsIgnoreCase(s4)) {
                    error = new DeleteResult.Error();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傒\u0001"))) {
                    newPullParser.next();
                    if (deleted != null) {
                        deleted.key = newPullParser.getText();
                    } else if (error != null) {
                        error.key = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傓\u0001"))) {
                    newPullParser.next();
                    if (deleted != null) {
                        deleted.versionId = newPullParser.getText();
                    } else if (error != null) {
                        error.versionId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傔\u0001"))) {
                    newPullParser.next();
                    if (deleted != null) {
                        deleted.deleteMarker = Boolean.parseBoolean(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傕\u0001"))) {
                    newPullParser.next();
                    if (deleted != null) {
                        deleted.deleteMarkerVersionId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傖\u0001"))) {
                    newPullParser.next();
                    if (error != null) {
                        error.message = newPullParser.getText();
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s5)) {
                    deleteResult.deletedList.add(deleted);
                    deleted = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    deleteResult.errorList.add(error);
                    error = null;
                }
            }
        }
    }

    public static void parseDomainConfiguration(InputStream inputStream, DomainConfiguration domainConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        domainConfiguration.domainRules = new ArrayList();
        DomainConfiguration.DomainRule domainRule = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傗\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s4)) {
                    domainRule = new DomainConfiguration.DomainRule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偾\u0001"))) {
                    newPullParser.next();
                    if (domainRule != null) {
                        domainRule.status = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傘\u0001"))) {
                    newPullParser.next();
                    if (domainRule != null) {
                        domainRule.name = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偿\u0001"))) {
                    newPullParser.next();
                    if (domainRule != null) {
                        domainRule.type = newPullParser.getText();
                    }
                }
            } else if (eventType == 3 && newPullParser.getName().equalsIgnoreCase(s4)) {
                domainConfiguration.domainRules.add(domainRule);
                domainRule = null;
            }
        }
    }

    public static void parseGetBucketObjectVersionsResult(InputStream inputStream, ListVersionResult listVersionResult) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        listVersionResult.commonPrefixes = linkedList;
        listVersionResult.deleteMarkers = linkedList3;
        listVersionResult.versions = linkedList2;
        ListVersionResult.Owner owner = null;
        ListVersionResult.DeleteMarker deleteMarker = null;
        ListVersionResult.Version version = null;
        ListVersionResult.CommonPrefixes commonPrefixes = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("備\u0001");
            String s5 = ProtectedSandApp.s("傚\u0001");
            String s6 = ProtectedSandApp.s("傔\u0001");
            String s7 = ProtectedSandApp.s("傂\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("傘\u0001"))) {
                    newPullParser.next();
                    listVersionResult.name = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傛\u0001"))) {
                    newPullParser.next();
                    listVersionResult.encodingType = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傜\u0001"))) {
                    newPullParser.next();
                    listVersionResult.keyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傝\u0001"))) {
                    newPullParser.next();
                    listVersionResult.versionIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傞\u0001"))) {
                    listVersionResult.maxKeys = com.tencent.cos.xml.model.ci.a.a(newPullParser);
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傟\u0001"))) {
                    newPullParser.next();
                    listVersionResult.delimiter = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傠\u0001"))) {
                    newPullParser.next();
                    listVersionResult.nextKeyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傡\u0001"))) {
                    newPullParser.next();
                    listVersionResult.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傢\u0001"))) {
                    newPullParser.next();
                    listVersionResult.nextVersionIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (commonPrefixes == null) {
                        listVersionResult.prefix = newPullParser.getText();
                    } else {
                        commonPrefixes.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傒\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.key = newPullParser.getText();
                    } else if (deleteMarker != null) {
                        deleteMarker.key = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傓\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.versionID = newPullParser.getText();
                    } else if (deleteMarker != null) {
                        deleteMarker.versionId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傤\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.isLatest = Boolean.parseBoolean(newPullParser.getText());
                    } else if (deleteMarker != null) {
                        deleteMarker.isLatest = Boolean.parseBoolean(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傥\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.lastModified = newPullParser.getText();
                    } else if (deleteMarker != null) {
                        deleteMarker.lastModified = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傦\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.etag = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傧\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.size = Long.parseLong(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("储\u0001"))) {
                    newPullParser.next();
                    if (version != null) {
                        version.storageClass = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s7)) {
                    owner = new ListVersionResult.Owner();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.f71733id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傄\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.displayName = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s6)) {
                    deleteMarker = new ListVersionResult.DeleteMarker();
                } else if (name.equalsIgnoreCase(s5)) {
                    version = new ListVersionResult.Version();
                } else if (name.equalsIgnoreCase(s4)) {
                    commonPrefixes = new ListVersionResult.CommonPrefixes();
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s7)) {
                    if (owner != null) {
                        if (deleteMarker != null) {
                            deleteMarker.owner = owner;
                        } else if (version != null) {
                            version.owner = owner;
                        }
                        owner = null;
                    }
                } else if (name2.equalsIgnoreCase(s6)) {
                    if (deleteMarker != null) {
                        linkedList3.add(deleteMarker);
                        deleteMarker = null;
                    }
                } else if (name2.equalsIgnoreCase(s5)) {
                    if (version != null) {
                        linkedList2.add(version);
                        version = null;
                    }
                } else if (name2.equalsIgnoreCase(s4) && commonPrefixes != null) {
                    linkedList.add(commonPrefixes);
                    commonPrefixes = null;
                }
            }
        }
    }

    public static void parseInventoryConfiguration(InputStream inputStream, InventoryConfiguration inventoryConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        InventoryConfiguration.COSBucketDestination cOSBucketDestination = null;
        InventoryConfiguration.OptionalFields optionalFields = null;
        InventoryConfiguration.Filter filter = null;
        InventoryConfiguration.Schedule schedule = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傩\u0001");
            String s5 = ProtectedSandApp.s("傪\u0001");
            String s6 = ProtectedSandApp.s("傫\u0001");
            String s7 = ProtectedSandApp.s("催\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("傭\u0001"))) {
                    newPullParser.next();
                    inventoryConfiguration.f71725id = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傮\u0001"))) {
                    newPullParser.next();
                    inventoryConfiguration.isEnabled = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(s7)) {
                    cOSBucketDestination = new InventoryConfiguration.COSBucketDestination();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傯\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.format = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傰\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.accountId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傱\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.bucket = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.prefix = newPullParser.getText();
                    } else if (filter != null) {
                        filter.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傲\u0001"))) {
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.encryption = new InventoryConfiguration.Encryption();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傳\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.encryption.sSECOS = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s4)) {
                    schedule = new InventoryConfiguration.Schedule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傴\u0001"))) {
                    newPullParser.next();
                    if (schedule != null) {
                        schedule.frequency = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    filter = new InventoryConfiguration.Filter();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("債\u0001"))) {
                    newPullParser.next();
                    inventoryConfiguration.includedObjectVersions = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s6)) {
                    optionalFields = new InventoryConfiguration.OptionalFields();
                    optionalFields.fields = new HashSet(6);
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傶\u0001"))) {
                    newPullParser.next();
                    if (optionalFields != null) {
                        optionalFields.fields.add(newPullParser.getText());
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s7)) {
                    InventoryConfiguration.Destination destination = new InventoryConfiguration.Destination();
                    inventoryConfiguration.destination = destination;
                    destination.cosBucketDestination = cOSBucketDestination;
                    cOSBucketDestination = null;
                } else if (name2.equalsIgnoreCase(s6)) {
                    inventoryConfiguration.optionalFields = optionalFields;
                    optionalFields = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    inventoryConfiguration.filter = filter;
                    filter = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    inventoryConfiguration.schedule = schedule;
                    schedule = null;
                }
            }
        }
    }

    public static void parseLifecycleConfiguration(InputStream inputStream, LifecycleConfiguration lifecycleConfiguration) throws XmlPullParserException, IOException {
        LifecycleConfiguration.AbortIncompleteMultiUpload abortIncompleteMultiUpload;
        LifecycleConfiguration lifecycleConfiguration2 = lifecycleConfiguration;
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        int eventType = newPullParser.getEventType();
        lifecycleConfiguration2.rules = new ArrayList();
        LifecycleConfiguration.Rule rule = null;
        LifecycleConfiguration.Filter filter = null;
        LifecycleConfiguration.Transition transition = null;
        LifecycleConfiguration.NoncurrentVersionExpiration noncurrentVersionExpiration = null;
        LifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = null;
        LifecycleConfiguration.Expiration expiration = null;
        LifecycleConfiguration.AbortIncompleteMultiUpload abortIncompleteMultiUpload2 = null;
        while (eventType != 1) {
            String s4 = ProtectedSandApp.s("傷\u0001");
            String s5 = ProtectedSandApp.s("傸\u0001");
            String s6 = ProtectedSandApp.s("傹\u0001");
            String s7 = ProtectedSandApp.s("傺\u0001");
            String s10 = ProtectedSandApp.s("傻\u0001");
            LifecycleConfiguration.AbortIncompleteMultiUpload abortIncompleteMultiUpload3 = abortIncompleteMultiUpload2;
            String s11 = ProtectedSandApp.s("傪\u0001");
            String s12 = ProtectedSandApp.s("傼\u0001");
            if (eventType != 2) {
                if (eventType == 3) {
                    String name = newPullParser.getName();
                    if (name.equalsIgnoreCase(s12)) {
                        lifecycleConfiguration2.rules.add(rule);
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        rule = null;
                    } else if (name.equalsIgnoreCase(s11)) {
                        if (rule != null) {
                            rule.filter = filter;
                        }
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        filter = null;
                    } else if (name.equalsIgnoreCase(s10)) {
                        if (rule != null) {
                            rule.transition = transition;
                        }
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        transition = null;
                    } else if (name.equalsIgnoreCase(s7)) {
                        if (rule != null) {
                            rule.noncurrentVersionExpiration = noncurrentVersionExpiration;
                        }
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        noncurrentVersionExpiration = null;
                    } else if (name.equalsIgnoreCase(s6)) {
                        if (rule != null) {
                            rule.noncurrentVersionTransition = noncurrentVersionTransition;
                        }
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        noncurrentVersionTransition = null;
                    } else if (name.equalsIgnoreCase(s5)) {
                        if (rule != null) {
                            rule.expiration = expiration;
                        }
                        abortIncompleteMultiUpload2 = abortIncompleteMultiUpload3;
                        expiration = null;
                    } else if (name.equalsIgnoreCase(s4)) {
                        if (rule != null) {
                            rule.abortIncompleteMultiUpload = abortIncompleteMultiUpload3;
                        }
                        abortIncompleteMultiUpload2 = null;
                    }
                    eventType = newPullParser.next();
                    lifecycleConfiguration2 = lifecycleConfiguration;
                }
                abortIncompleteMultiUpload = abortIncompleteMultiUpload3;
                abortIncompleteMultiUpload2 = abortIncompleteMultiUpload;
                eventType = newPullParser.next();
                lifecycleConfiguration2 = lifecycleConfiguration;
            } else {
                abortIncompleteMultiUpload = abortIncompleteMultiUpload3;
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s12)) {
                    rule = new LifecycleConfiguration.Rule();
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (rule != null) {
                        rule.f71726id = newPullParser.getText();
                    }
                } else if (name2.equalsIgnoreCase(s11)) {
                    filter = new LifecycleConfiguration.Filter();
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (filter != null) {
                        filter.prefix = newPullParser.getText();
                    }
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("偾\u0001"))) {
                    newPullParser.next();
                    if (rule != null) {
                        rule.status = newPullParser.getText();
                    }
                } else if (name2.equalsIgnoreCase(s10)) {
                    transition = new LifecycleConfiguration.Transition();
                } else if (name2.equalsIgnoreCase(s5)) {
                    expiration = new LifecycleConfiguration.Expiration();
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("傽\u0001"))) {
                    newPullParser.next();
                    if (transition != null) {
                        transition.days = Integer.parseInt(newPullParser.getText());
                    } else if (rule != null && rule.expiration != null && expiration != null) {
                        expiration.days = Integer.parseInt(newPullParser.getText());
                    }
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("傾\u0001"))) {
                    newPullParser.next();
                    if (transition != null) {
                        transition.date = newPullParser.getText();
                    } else if (expiration != null) {
                        expiration.date = newPullParser.getText();
                    }
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("傿\u0001"))) {
                    newPullParser.next();
                    if (expiration != null) {
                        expiration.expiredObjectDeleteMarker = newPullParser.getText();
                    }
                } else if (name2.equalsIgnoreCase(s4)) {
                    abortIncompleteMultiUpload2 = new LifecycleConfiguration.AbortIncompleteMultiUpload();
                    eventType = newPullParser.next();
                    lifecycleConfiguration2 = lifecycleConfiguration;
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("僀\u0001"))) {
                    newPullParser.next();
                    if (abortIncompleteMultiUpload != null) {
                        abortIncompleteMultiUpload.daysAfterInitiation = Integer.parseInt(newPullParser.getText());
                    }
                } else if (name2.equalsIgnoreCase(s7)) {
                    noncurrentVersionExpiration = new LifecycleConfiguration.NoncurrentVersionExpiration();
                } else if (name2.equalsIgnoreCase(s6)) {
                    noncurrentVersionTransition = new LifecycleConfiguration.NoncurrentVersionTransition();
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("僁\u0001"))) {
                    newPullParser.next();
                    if (noncurrentVersionExpiration != null) {
                        noncurrentVersionExpiration.noncurrentDays = Integer.parseInt(newPullParser.getText());
                    } else if (noncurrentVersionTransition != null) {
                        noncurrentVersionTransition.noncurrentDays = Integer.parseInt(newPullParser.getText());
                    }
                } else if (name2.equalsIgnoreCase(ProtectedSandApp.s("储\u0001"))) {
                    newPullParser.next();
                    if (transition != null) {
                        transition.storageClass = newPullParser.getText();
                    } else if (noncurrentVersionTransition != null) {
                        noncurrentVersionTransition.storageClass = newPullParser.getText();
                    }
                }
                abortIncompleteMultiUpload2 = abortIncompleteMultiUpload;
                eventType = newPullParser.next();
                lifecycleConfiguration2 = lifecycleConfiguration;
            }
        }
    }

    public static void parseListBucketResult(InputStream inputStream, ListBucket listBucket) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        listBucket.contentsList = new ArrayList();
        listBucket.commonPrefixesList = new ArrayList();
        ListBucket.Contents contents = null;
        ListBucket.CommonPrefixes commonPrefixes = null;
        ListBucket.Owner owner = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("備\u0001");
            String s5 = ProtectedSandApp.s("傂\u0001");
            String s6 = ProtectedSandApp.s("僂\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("傘\u0001"))) {
                    newPullParser.next();
                    listBucket.name = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傛\u0001"))) {
                    newPullParser.next();
                    listBucket.encodingType = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僃\u0001"))) {
                    newPullParser.next();
                    listBucket.marker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傞\u0001"))) {
                    listBucket.maxKeys = com.tencent.cos.xml.model.ci.a.a(newPullParser);
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傟\u0001"))) {
                    newPullParser.next();
                    listBucket.delimiter = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僄\u0001"))) {
                    newPullParser.next();
                    listBucket.nextMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傡\u0001"))) {
                    newPullParser.next();
                    listBucket.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (commonPrefixes == null) {
                        listBucket.prefix = newPullParser.getText();
                    } else {
                        commonPrefixes.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s6)) {
                    contents = new ListBucket.Contents();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傒\u0001"))) {
                    newPullParser.next();
                    if (contents != null) {
                        contents.key = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傥\u0001"))) {
                    newPullParser.next();
                    if (contents != null) {
                        contents.lastModified = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傦\u0001"))) {
                    newPullParser.next();
                    if (contents != null) {
                        contents.eTag = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傧\u0001"))) {
                    newPullParser.next();
                    if (contents != null) {
                        contents.size = Long.parseLong(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("储\u0001"))) {
                    newPullParser.next();
                    if (contents != null) {
                        contents.storageClass = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    owner = new ListBucket.Owner();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.f71728id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s4)) {
                    commonPrefixes = new ListBucket.CommonPrefixes();
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s6)) {
                    listBucket.contentsList.add(contents);
                    contents = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    if (contents != null) {
                        contents.owner = owner;
                    }
                    owner = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    listBucket.commonPrefixesList.add(commonPrefixes);
                    commonPrefixes = null;
                }
            }
        }
    }

    public static void parseListBucketVersions(InputStream inputStream, ListBucketVersions listBucketVersions) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        listBucketVersions.objectVersionList = new ArrayList();
        ListBucketVersions.ObjectVersion objectVersion = null;
        ListBucketVersions.Owner owner = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("傚\u0001");
            String s5 = ProtectedSandApp.s("傔\u0001");
            String s6 = ProtectedSandApp.s("傂\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("傘\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.name = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.prefix = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傜\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.keyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傝\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.versionIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傞\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.maxKeys = Long.parseLong(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傡\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傠\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.nextKeyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傢\u0001"))) {
                    newPullParser.next();
                    listBucketVersions.nextVersionIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s5)) {
                    objectVersion = new ListBucketVersions.DeleteMarker();
                } else if (name.equalsIgnoreCase(s4)) {
                    objectVersion = new ListBucketVersions.Version();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傒\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null) {
                        objectVersion.key = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傓\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null) {
                        objectVersion.versionId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傤\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null) {
                        objectVersion.isLatest = Boolean.parseBoolean(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傥\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null) {
                        objectVersion.lastModified = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s6)) {
                    owner = new ListBucketVersions.Owner();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僅\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.uid = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傦\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null && (objectVersion instanceof ListBucketVersions.Version)) {
                        ((ListBucketVersions.Version) objectVersion).eTag = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傧\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null && (objectVersion instanceof ListBucketVersions.Version)) {
                        ((ListBucketVersions.Version) objectVersion).size = Long.parseLong(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("储\u0001"))) {
                    newPullParser.next();
                    if (objectVersion != null && (objectVersion instanceof ListBucketVersions.Version)) {
                        ((ListBucketVersions.Version) objectVersion).storageClass = newPullParser.getText();
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s6)) {
                    if (objectVersion != null) {
                        objectVersion.owner = owner;
                    }
                    owner = null;
                } else {
                    if (name2.equalsIgnoreCase(s5)) {
                        listBucketVersions.objectVersionList.add(objectVersion);
                    } else if (name2.equalsIgnoreCase(s4)) {
                        listBucketVersions.objectVersionList.add(objectVersion);
                    }
                    objectVersion = null;
                }
            }
        }
    }

    public static void parseListInventoryConfiguration(InputStream inputStream, ListInventoryConfiguration listInventoryConfiguration) throws IOException, XmlPullParserException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        listInventoryConfiguration.inventoryConfigurations = new HashSet(20);
        InventoryConfiguration inventoryConfiguration = null;
        InventoryConfiguration.OptionalFields optionalFields = null;
        InventoryConfiguration.COSBucketDestination cOSBucketDestination = null;
        InventoryConfiguration.Schedule schedule = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("僆\u0001");
            String s5 = ProtectedSandApp.s("傩\u0001");
            String s6 = ProtectedSandApp.s("傪\u0001");
            String s7 = ProtectedSandApp.s("傫\u0001");
            String s10 = ProtectedSandApp.s("催\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("傡\u0001"))) {
                    newPullParser.next();
                    listInventoryConfiguration.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僇\u0001"))) {
                    newPullParser.next();
                    listInventoryConfiguration.continuationToken = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僈\u0001"))) {
                    newPullParser.next();
                    listInventoryConfiguration.nextContinuationToken = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s4)) {
                    inventoryConfiguration = new InventoryConfiguration();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傭\u0001"))) {
                    newPullParser.next();
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.f71725id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傮\u0001"))) {
                    newPullParser.next();
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.isEnabled = Boolean.parseBoolean(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(s10)) {
                    cOSBucketDestination = new InventoryConfiguration.COSBucketDestination();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傯\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.format = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傰\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.accountId = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傱\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.bucket = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傲\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.encryption = new InventoryConfiguration.Encryption();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傳\u0001"))) {
                    newPullParser.next();
                    if (cOSBucketDestination != null) {
                        cOSBucketDestination.encryption.sSECOS = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    schedule = new InventoryConfiguration.Schedule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傴\u0001"))) {
                    newPullParser.next();
                    if (schedule != null) {
                        schedule.frequency = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s6)) {
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.filter = new InventoryConfiguration.Filter();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("債\u0001"))) {
                    newPullParser.next();
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.includedObjectVersions = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s7)) {
                    optionalFields = new InventoryConfiguration.OptionalFields();
                    optionalFields.fields = new HashSet(6);
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傶\u0001"))) {
                    newPullParser.next();
                    if (optionalFields != null) {
                        optionalFields.fields.add(newPullParser.getText());
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s10)) {
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.destination = new InventoryConfiguration.Destination();
                    }
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.destination.cosBucketDestination = cOSBucketDestination;
                    }
                    cOSBucketDestination = null;
                } else if (name2.equalsIgnoreCase(s7)) {
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.optionalFields = optionalFields;
                    }
                    optionalFields = null;
                } else if (name2.equalsIgnoreCase(s6)) {
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.filter = null;
                    }
                } else if (name2.equalsIgnoreCase(s5)) {
                    if (inventoryConfiguration != null) {
                        inventoryConfiguration.schedule = schedule;
                    }
                    schedule = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    listInventoryConfiguration.inventoryConfigurations.add(inventoryConfiguration);
                    inventoryConfiguration = null;
                }
            }
        }
    }

    public static void parseLocationConstraint(InputStream inputStream, LocationConstraint locationConstraint) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2 && newPullParser.getName().equalsIgnoreCase(ProtectedSandApp.s("僉\u0001"))) {
                newPullParser.next();
                locationConstraint.location = newPullParser.getText();
            }
        }
    }

    public static void parseReplicationConfiguration(InputStream inputStream, ReplicationConfiguration replicationConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        replicationConfiguration.rules = new ArrayList();
        ReplicationConfiguration.Rule rule = null;
        ReplicationConfiguration.Destination destination = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("僊\u0001");
            String s5 = ProtectedSandApp.s("傼\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("僋\u0001"))) {
                    newPullParser.next();
                    replicationConfiguration.role = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s5)) {
                    rule = new ReplicationConfiguration.Rule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偾\u0001"))) {
                    newPullParser.next();
                    if (rule != null) {
                        rule.status = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傃\u0001"))) {
                    newPullParser.next();
                    if (rule != null) {
                        rule.f71734id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傣\u0001"))) {
                    newPullParser.next();
                    if (rule != null) {
                        rule.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s4)) {
                    destination = new ReplicationConfiguration.Destination();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傱\u0001"))) {
                    newPullParser.next();
                    if (destination != null) {
                        destination.bucket = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("储\u0001"))) {
                    newPullParser.next();
                    if (destination != null) {
                        destination.storageClass = newPullParser.getText();
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s5)) {
                    replicationConfiguration.rules.add(rule);
                    rule = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    if (rule != null) {
                        rule.destination = destination;
                    }
                    destination = null;
                }
            }
        }
    }

    public static void parseTagging(InputStream inputStream, Tagging tagging) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        Tagging.TagSet tagSet = null;
        Tagging.Tag tag = null;
        String str = null;
        String str2 = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("僌\u0001");
            String s5 = ProtectedSandApp.s("傒\u0001");
            String s6 = ProtectedSandApp.s("働\u0001");
            String s7 = ProtectedSandApp.s("僎\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (s7.equalsIgnoreCase(name)) {
                    tagSet = new Tagging.TagSet();
                } else if (s6.equalsIgnoreCase(name)) {
                    tag = new Tagging.Tag();
                } else if (s5.equalsIgnoreCase(name)) {
                    newPullParser.next();
                    str = newPullParser.getText();
                } else if (s4.equalsIgnoreCase(name)) {
                    newPullParser.next();
                    str2 = newPullParser.getText();
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (s7.equalsIgnoreCase(name2)) {
                    tagging.tagSet = tagSet;
                    tagSet = null;
                } else if (s6.equalsIgnoreCase(name2)) {
                    if (tagSet != null) {
                        tagSet.addTag(tag);
                    }
                } else if (s5.equalsIgnoreCase(name2)) {
                    if (tag != null) {
                        tag.key = str;
                    }
                } else if (s4.equalsIgnoreCase(name2) && tag != null) {
                    tag.value = str2;
                }
            }
        }
    }

    public static void parseVersioningConfiguration(InputStream inputStream, VersioningConfiguration versioningConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2 && newPullParser.getName().equalsIgnoreCase(ProtectedSandApp.s("偾\u0001"))) {
                newPullParser.next();
                versioningConfiguration.status = newPullParser.getText();
            }
        }
    }

    public static void parseWebsiteConfig(InputStream inputStream, WebsiteConfiguration websiteConfiguration) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偽\u0001"));
        websiteConfiguration.routingRules = new ArrayList();
        WebsiteConfiguration.IndexDocument indexDocument = null;
        WebsiteConfiguration.ErrorDocument errorDocument = null;
        WebsiteConfiguration.RedirectAllRequestTo redirectAllRequestTo = null;
        WebsiteConfiguration.RoutingRule routingRule = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("像\u0001");
            String s5 = ProtectedSandApp.s("僐\u0001");
            String s6 = ProtectedSandApp.s("僑\u0001");
            String s7 = ProtectedSandApp.s("僒\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(s7)) {
                    indexDocument = new WebsiteConfiguration.IndexDocument();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僓\u0001"))) {
                    newPullParser.next();
                    if (indexDocument != null) {
                        indexDocument.suffix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s6)) {
                    errorDocument = new WebsiteConfiguration.ErrorDocument();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("傒\u0001"))) {
                    newPullParser.next();
                    if (errorDocument != null) {
                        errorDocument.key = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    redirectAllRequestTo = new WebsiteConfiguration.RedirectAllRequestTo();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僔\u0001"))) {
                    newPullParser.next();
                    if (redirectAllRequestTo != null) {
                        redirectAllRequestTo.protocol = newPullParser.getText();
                    } else if (routingRule != null) {
                        routingRule.redirect.protocol = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s4)) {
                    routingRule = new WebsiteConfiguration.RoutingRule();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僕\u0001"))) {
                    if (routingRule != null) {
                        routingRule.contidion = new WebsiteConfiguration.Contidion();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僖\u0001"))) {
                    newPullParser.next();
                    if (routingRule != null) {
                        routingRule.contidion.httpErrorCodeReturnedEquals = Integer.parseInt(newPullParser.getText());
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僗\u0001"))) {
                    newPullParser.next();
                    if (routingRule != null) {
                        routingRule.contidion.keyPrefixEquals = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僘\u0001"))) {
                    if (routingRule != null) {
                        routingRule.redirect = new WebsiteConfiguration.Redirect();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僙\u0001"))) {
                    newPullParser.next();
                    if (routingRule != null) {
                        routingRule.redirect.replaceKeyPrefixWith = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("僚\u0001"))) {
                    newPullParser.next();
                    if (routingRule != null) {
                        routingRule.redirect.replaceKeyWith = newPullParser.getText();
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s7)) {
                    websiteConfiguration.indexDocument = indexDocument;
                    indexDocument = null;
                } else if (name2.equalsIgnoreCase(s6)) {
                    websiteConfiguration.errorDocument = errorDocument;
                    errorDocument = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    websiteConfiguration.redirectAllRequestTo = redirectAllRequestTo;
                    redirectAllRequestTo = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    websiteConfiguration.routingRules.add(routingRule);
                    routingRule = null;
                }
            }
        }
    }
}
