/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $URL$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.spatialschema.geometry.primitive;

// J2SE direct dependencies
import java.util.List;

// OpenGIS direct dependencies
import org.opengis.spatialschema.geometry.geometry.GenericCurve;


/**
 * Curve with a positive orientation. <code>Curve</code> is
 * a descendent subtype of {@link Primitive} through {@link OrientablePrimitive}. It is the basis
 * for 1-dimensional geometry. A curve is a continuous image of an open interval and so could be
 * written as a parameterized function such as
 *
 * <code>c(t):(a,&nbsp;b) &rarr; E<sup>n</sup></code>
 *
 * where "t" is a real parameter and E<sup>n</sup> is Euclidean space of dimension <var>n</var>
 * (usually 2 or 3, as determined by the coordinate reference system). Any other parameterization
 * that results in the same image curve, traced in the same direction, such as any linear shifts
 * and positive scales such as
 *
 * <code>e(t) = c(a&nbsp;+&nbsp;t(b-a)):(0,1) &rarr; E<sup>n</sup></code>,
 *
 * is an equivalent representation of the same curve. For the sake of simplicity, <code>Curve</code>s
 * should be parameterized by arc length, so that the parameterization operation inherited from
 * {@link GenericCurve} will be valid for parameters between 0 and the length of the curve.
 * <br><br>
 * Curves are continuous, connected, and have a measurable length in terms of the coordinate system.
 * The orientation of the curve is determined by this parameterization, and is consistent with the
 * tangent function, which approximates the derivative function of the parameterization and shall
 * always point in the "forward" direction. The parameterization of the reversal of the curve defined
 * by
 *
 * <code>c(t):(a,&nbsp;b) &rarr; E<sup>n</sup></code>
 *
 * would be defined by a function of the form
 *
 * <code>s(t) = c(a&nbsp;+&nbsp;b&nbsp;-&nbsp;t):(a,&nbsp;b) &rarr; E<sup>n</sup></code>.
 *
 * <br><br>
 * A curve is composed of one or more curve segments. Each curve segment within a curve may be
 * defined using a different interpolation method. The curve segments are connected to one another,
 * with the end point of each segment except the last being the start point of the next segment in
 * the segment list.
 *
 * @UML type GM_Curve
 * @author ISO/DIS 19107
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version 2.0
 *
 * @see PrimitiveFactory#createCurve
 */
public interface Curve extends OrientableCurve, GenericCurve {
    /**
     * Lists the components {@linkplain CurveSegment curve segments} of <code>Curve</code>, each
     * of which defines the direct position of points along a portion of the curve. The order of
     * the {@linkplain CurveSegment curve segments} is the order in which they are used to trace
     * this <code>Curve</code>. For a particular parameter interval, the <code>Curve</code> and
     * {@link CurveSegment} agree.
     *
     * @return The list of curve segments. Should never be <code>null</code> neither empty.
     * @UML association segment
     *
     * @see CurveSegment#getCurve
     */
    public List/*<CurveSegment>*/ getSegments();
}
