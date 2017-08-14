package com.filestack.model.transform.tasks.rotate;

import com.filestack.model.transform.base.ImageTransformTask;

public class FlipTask extends ImageTransformTask {

  // Constructor left public because this task can be used with default options
  // Builder doesn't make sense for this task
  public FlipTask() {
    super("flip");
  }
}