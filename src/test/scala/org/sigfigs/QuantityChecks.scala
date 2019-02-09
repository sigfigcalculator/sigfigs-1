/*                                                                      *\
** Squants                                                              **
**                                                                      **
** Scala Quantities and Units of Measure Library and DSL                **
** (c) 2013-2015, Gary Keorkunian                                       **
**                                                                      **
\*                                                                      */

package org.sigfigs

import org.scalacheck.Gen

import terra._
import terra.time.Seconds

/**
 * @author  garyKeorkunian
 * @since   0.1
 *
 */
trait QuantityChecks {

  type TestData = Int
  val posNum: Gen[TestData] = Gen.posNum[TestData]
  val tol = 1e-13
  implicit val tolTime = Seconds(tol)
}
