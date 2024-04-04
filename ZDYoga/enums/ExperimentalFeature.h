/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

// @generated by enums.py
// clang-format off
#pragma once

#include <cstdint>
#include <ZDYoga/YGEnums.h>
#include <ZDYoga/enums/YogaEnums.h>

namespace facebook::yoga {

enum class ExperimentalFeature : uint8_t {
  WebFlexBasis = YGExperimentalFeatureWebFlexBasis,
};

template <>
constexpr int32_t ordinalCount<ExperimentalFeature>() {
  return 1;
}

constexpr ExperimentalFeature scopedEnum(YGExperimentalFeature unscoped) {
  return static_cast<ExperimentalFeature>(unscoped);
}

constexpr YGExperimentalFeature unscopedEnum(ExperimentalFeature scoped) {
  return static_cast<YGExperimentalFeature>(scoped);
}

inline const char* toString(ExperimentalFeature e) {
  return YGExperimentalFeatureToString(unscopedEnum(e));
}

} // namespace facebook::yoga
