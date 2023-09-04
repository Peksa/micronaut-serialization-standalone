package net.peksa.micronaut;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record BlaRecord(String foo) {}
