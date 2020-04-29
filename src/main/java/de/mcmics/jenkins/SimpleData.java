package de.mcmics.jenkins;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
class SimpleData implements Data {

    private final long id;
    private int position;

    public SimpleData(long id) {
        this(id, 0);
    }

}
