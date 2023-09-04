# Attempt micronaut serialization without using most of micronaut

Run with:

```bash
./gradlew run
```

Outputs:

```
Exception in thread "main" io.micronaut.serde.exceptions.SerdeException: No serializable introspection present for type BlaClass. Consider adding Serdeable. Serializable annotate to type BlaClass. Alternatively if you are not in control of the project's source code, you can use @SerdeImport(BlaClass.class) to enable serialization of this type.
	at io.micronaut.serde.support.serializers.ObjectSerializer$4.tryToFindSerializer(ObjectSerializer.java:218)
	at io.micronaut.serde.support.serializers.ObjectSerializer$RuntimeTypeSerializer.lambda$getSerializer$0(ObjectSerializer.java:280)
	at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1708)
	at io.micronaut.serde.support.serializers.ObjectSerializer$RuntimeTypeSerializer.getSerializer(ObjectSerializer.java:278)
	at io.micronaut.serde.support.serializers.ObjectSerializer$RuntimeTypeSerializer.serialize(ObjectSerializer.java:245)
	at io.micronaut.serde.jackson.JacksonJsonMapper.writeValue(JacksonJsonMapper.java:114)
	at io.micronaut.serde.jackson.JacksonJsonMapper.writeValue0(JacksonJsonMapper.java:106)
	at io.micronaut.serde.jackson.JacksonJsonMapper.writeValue0(JacksonJsonMapper.java:100)
	at io.micronaut.serde.jackson.JacksonJsonMapper.writeValueAsBytes(JacksonJsonMapper.java:201)
	at io.micronaut.serde.ObjectMapper.writeValueAsString(ObjectMapper.java:39)
	at net.peksa.micronaut.Main.main(Main.java:14)
Caused by: io.micronaut.core.beans.exceptions.IntrospectionException: No serializable introspection present for type BlaClass. Consider adding Serdeable. Serializable annotate to type BlaClass. Alternatively if you are not in control of the project's source code, you can use @SerdeImport(BlaClass.class) to enable serialization of this type.
	at io.micronaut.serde.support.DefaultSerdeIntrospections.getSerializableIntrospection(DefaultSerdeIntrospections.java:102)
	at io.micronaut.serde.support.serializers.SerBean.<init>(SerBean.java:107)
	at io.micronaut.serde.support.serializers.ObjectSerializer.create(ObjectSerializer.java:202)
	at io.micronaut.serde.support.serializers.ObjectSerializer.lambda$getSerBean$0(ObjectSerializer.java:193)
	at io.micronaut.core.util.SupplierUtil$2.get(SupplierUtil.java:79)
	at io.micronaut.serde.support.serializers.ObjectSerializer.getSerBean(ObjectSerializer.java:194)
	at io.micronaut.serde.support.serializers.ObjectSerializer.createSpecificInternal(ObjectSerializer.java:93)
	at io.micronaut.serde.support.serializers.ObjectSerializer.createSpecific(ObjectSerializer.java:86)
	at io.micronaut.serde.jackson.JacksonJsonMapper.writeValue(JacksonJsonMapper.java:112)
	... 5 more

FAILURE: Build failed with an exception.
```
