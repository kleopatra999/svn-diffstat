package com.github.marschal.svndiffstat;

import java.awt.Dimension;
import java.io.File;
import java.nio.file.Path;
import java.util.Set;

final class DiffStatConfiguration {

  private final Set<String> authors;
  private final Set<String> includedFiles;
  private final File workingCopy;
  private final Dimension dimension;
  private final Path savePath;
  private final boolean doubleSize;
  private final int maxChanges;
  private final String protocol;
  private final TickConfiguration dateAxisTick;
  private final TickConfiguration valueAxisTick;
  private final int maxDomainTicks;

  DiffStatConfiguration(Set<String> authors, Set<String> includedFiles, File workingCopy, Dimension dimension, Path savePath, boolean doubleSize, int maxChanges, String protocol, TickConfiguration dateAxisTick, TickConfiguration valueAxisTick, int maxDomainTicks) {
    this.authors = authors;
    this.includedFiles = includedFiles;
    this.workingCopy = workingCopy;
    this.dimension = dimension;
    this.savePath = savePath;
    this.doubleSize = doubleSize;
    this.maxChanges = maxChanges;
    this.protocol = protocol;
    this.dateAxisTick = dateAxisTick;
    this.valueAxisTick = valueAxisTick;
    this.maxDomainTicks = maxDomainTicks;
  }

  Set<String> getAuthors() {
    return this.authors;
  }

  Set<String> getIncludedFiles() {
    return this.includedFiles;
  }

  File getWorkingCopy() {
    return this.workingCopy;
  }

  Dimension getDimension() {
    return this.dimension;
  }

  Path getSavePath() {
    return this.savePath;
  }

  int multiplierInt() {
    return this.doubleSize ? 2 : 1;
  }

  double multiplierDouble() {
    return this.doubleSize ? 2.0d : 1.0d;
  }

  float multiplierFloat() {
    return this.doubleSize ? 2.0f : 1.0f;
  }

  boolean isDoubleSize() {
    return this.doubleSize;
  }

  int getMaxChanges() {
    return this.maxChanges;
  }
  
  String getProtocol() {
    return this.protocol;
  }

  TickConfiguration getDateAxisTick() {
    return this.dateAxisTick;
  }

  TickConfiguration getValueAxisTick() {
    return this.valueAxisTick;
  }
  
  int getMaxDomainTicks() {
    return this.maxDomainTicks;
  }

}
