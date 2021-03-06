// Copyright 2015 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.rules.android;

import com.google.devtools.build.lib.actions.ExecutionStrategy;
import com.google.devtools.build.lib.actions.Executor.ActionContext;

import javax.annotation.Nullable;

/**
 * {@link ActionContext} for {@link WriteAdbArgsAction}.
 */
@ExecutionStrategy(contextType = WriteAdbArgsActionContext.class)
public final class WriteAdbArgsActionContext implements ActionContext {

  private final String userHomeDirectory;

  public WriteAdbArgsActionContext(String userHomeDirectory) {
    this.userHomeDirectory = userHomeDirectory;
  }

  /**
   * @return The user's home directory as set in the environment in which the Blaze client is called
   *    or null if the HOME environment variable has not been set.
   */
  @Nullable
  public String getUserHomeDirectory() {
    return userHomeDirectory;
  }
}
