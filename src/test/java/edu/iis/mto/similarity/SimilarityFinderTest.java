package edu.iis.mto.similarity;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class SimilarityFinderTest {

    @Test
    public void ShouldReturnOneIfSetsAreEqual() {

        int seq1[] = {1, 4, 2, 5};
        int seq2[] = {1, 4, 2, 5};

        SimilarityFinder similarityFinder = new SimilarityFinder(new SequenceSearcherDoubler());

        Assert.assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), Matchers.equalTo(1.0));
    }

}
