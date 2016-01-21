package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Candidate Associations.
 * 
 * @author Magnus
 * 
 */
public final class CandidateAssociations implements EntityAssociations<Candidate> {

    private final AssociationField<Candidate, BusinessSector> businessSectors = instantiateAssociationField("businessSectors",
            BusinessSector.class);
    private final AssociationField<Candidate, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Candidate, Skill> primarySkills = instantiateAssociationField("primarySkills", Skill.class);
    private final AssociationField<Candidate, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners",
            CorporateUser.class);
    private final AssociationField<Candidate, Skill> secondarySkills = instantiateAssociationField("secondarySkills", Skill.class);
    private final AssociationField<Candidate, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);

    private final AssociationField<Candidate, PersonCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", PersonCustomObjectInstance1.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", PersonCustomObjectInstance2.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", PersonCustomObjectInstance3.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", PersonCustomObjectInstance4.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", PersonCustomObjectInstance5.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", PersonCustomObjectInstance6.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", PersonCustomObjectInstance7.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", PersonCustomObjectInstance8.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", PersonCustomObjectInstance9.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", PersonCustomObjectInstance10.class);

    private List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations;
    private static final CandidateAssociations INSTANCE = new CandidateAssociations();

    private CandidateAssociations() {
        super();
    }

    public static CandidateAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Candidate, BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Candidate, Category> categories() {
        return categories;
    }

    public AssociationField<Candidate, Skill> primarySkills() {
        return primarySkills;
    }

    public AssociationField<Candidate, CorporateUser> secondaryOwners() {
        return secondaryOwners;
    }

    public AssociationField<Candidate, Skill> secondarySkills() {
        return secondarySkills;
    }
    
    public AssociationField<Candidate, Specialty> specialties() {
        return specialties;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }

    private <E extends BullhornEntity> AssociationField<Candidate, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Candidate, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Candidate, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(primarySkills());
            allAssociations.add(secondaryOwners());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
            allAssociations.add(customObject1s());
            allAssociations.add(customObject2s());
            allAssociations.add(customObject3s());
            allAssociations.add(customObject4s());
            allAssociations.add(customObject5s());
            allAssociations.add(customObject6s());
            allAssociations.add(customObject7s());
            allAssociations.add(customObject8s());
            allAssociations.add(customObject9s());
            allAssociations.add(customObject10s());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<Candidate, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Candidate, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Candidate called: " + associationName);
    }

}
