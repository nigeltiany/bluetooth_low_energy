//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/messages.proto

package dev.yanshouwang.bluetooth_low_energy.proto;

@kotlin.jvm.JvmName("-initializeserviceData")
inline fun serviceData(block: dev.yanshouwang.bluetooth_low_energy.proto.ServiceDataKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.bluetooth_low_energy.proto.ServiceData =
  dev.yanshouwang.bluetooth_low_energy.proto.ServiceDataKt.Dsl._create(dev.yanshouwang.bluetooth_low_energy.proto.ServiceData.newBuilder()).apply { block() }._build()
object ServiceDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: dev.yanshouwang.bluetooth_low_energy.proto.ServiceData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.bluetooth_low_energy.proto.ServiceData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.bluetooth_low_energy.proto.ServiceData = _builder.build()

    /**
     * <code>.proto.UUID uuid = 1;</code>
     */
    var uuid: dev.yanshouwang.bluetooth_low_energy.proto.UUID
      @JvmName("getUuid")
      get() = _builder.getUuid()
      @JvmName("setUuid")
      set(value) {
        _builder.setUuid(value)
      }
    /**
     * <code>.proto.UUID uuid = 1;</code>
     */
    fun clearUuid() {
      _builder.clearUuid()
    }
    /**
     * <code>.proto.UUID uuid = 1;</code>
     * @return Whether the uuid field is set.
     */
    fun hasUuid(): kotlin.Boolean {
      return _builder.hasUuid()
    }

    /**
     * <code>bytes data = 2;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>bytes data = 2;</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun dev.yanshouwang.bluetooth_low_energy.proto.ServiceData.copy(block: dev.yanshouwang.bluetooth_low_energy.proto.ServiceDataKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.bluetooth_low_energy.proto.ServiceData =
  dev.yanshouwang.bluetooth_low_energy.proto.ServiceDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val dev.yanshouwang.bluetooth_low_energy.proto.ServiceDataOrBuilder.uuidOrNull: dev.yanshouwang.bluetooth_low_energy.proto.UUID?
  get() = if (hasUuid()) getUuid() else null
