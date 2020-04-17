# Computational Geometry

## My own implementation of classical computational geometry algorithms on diverse languages.

This repository contains fully functional code on different languages, implementing the classic and basic algorithms of computational geometry, depending on the algorithm, is the language chosen to write the code. I use different types of datastructures, such as; stacks, vectors, lists, self-balancing trees, and so on.

## Convex Hull.

Given a set of points (S) in a plane, find the convex hull of S, where the convex hull fulfills that for every two points in S, say P, Q then the line PQ is fully contained on the convex hull. 

#### Graham Scan

Find the lowest point, the one closest to the x-axis, then sort the points according to their angles taking the lowest point as the center. Move across the points and adding the ones that made a left turn considering the two previous added, pop any point that made a right turn until the last that made a left turn.

Time complexity: O(n log n), where n = |S|.

Space complexity: O(n)

#### Gift Wrapping

Find any point that's on an edge of the set, for simplicity, take the closest to the x-axis. Calculate the angles of the rest of the points in terms of the smallest point and keep the one with the smallest angle, an repeat over that point, considering that you've already turned a certain angle, this is to reorient the cartesian plane.

Time complexity: O(kn), where k is the number of points that belong to the convex hull.

Space complexity: O(n), where n = |S|.

## Sweep Line.

Given a set of segments, which each segment is determined by a pair of points, find all the intersections of the segments.

Time complexity: O(n log n + k log n), where k is the number of intersections of the segments, can be up to n^2.

Space complexity: O(n + k)

### License
[![MIT License](https://img.shields.io/badge/license-MIT-blue)](https://opensource.org/licenses/mit-license.php)
