module.exports = {
    testRunner: 'jest-circus/runner',
    testRegex: ['/__tests__/.*.spec.js?$'],
    reporters: [
        'default',
        [
            '@reportportal/agent-js-jest',
            {
                apiKey: 'test_ItXmlO8dRgumPId4TrZtErS-S9GGuqG2iaPbBJCYwFXuknG_ESQujEHa5dq-utDV',
                endpoint: 'https://reportportal.epam.com/api/v1',
                launch: 'JS Jest run',
                project: 'AHMED_AZHAZH_PERSONAL',
                description: 'Test JS',
                attributes: [
                ]
            }
        ]
    ],
};
