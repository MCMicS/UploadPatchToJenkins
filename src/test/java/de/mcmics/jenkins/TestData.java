package de.mcmics.jenkins;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@lombok.Data
class TestData implements Data {

    private final long id;
    private int position;
}
