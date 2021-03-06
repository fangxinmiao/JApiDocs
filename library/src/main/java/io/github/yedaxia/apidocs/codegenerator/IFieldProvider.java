package io.github.yedaxia.apidocs.codegenerator;

import io.github.yedaxia.apidocs.parser.ResponseNode;
import io.github.yedaxia.apidocs.codegenerator.model.FieldModel;

import java.util.List;

public interface IFieldProvider {
	/**
	 *
	 * @param
	 * @return
	 */
	List<FieldModel> provideEntryFields(ResponseNode respNode);
}
