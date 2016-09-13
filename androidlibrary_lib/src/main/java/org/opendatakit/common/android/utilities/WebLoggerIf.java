/*
 * Copyright (C) 2012-2013 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.common.android.utilities;

/**
 * Logger that emits logs to the LOGGING_PATH and recycles them as needed.
 * Useful to separate out ODK log entries from the overall logging stream,
 * especially on heavily logged 4.x systems.
 *
 * @author mitchellsundt@gmail.com
 */
public interface WebLoggerIf {

  void staleFileScan(long now);

  void close();

  void log(int severity, String t, String logMsg);

  void a(String t, String logMsg);

  void t(String t, String logMsg);
  void v(String t, String logMsg);
  void d(String t, String logMsg);
  void i(String t, String logMsg);
  void w(String t, String logMsg);
  void e(String t, String logMsg);
  void s(String t, String logMsg);

  void printStackTrace(Throwable e);

}
