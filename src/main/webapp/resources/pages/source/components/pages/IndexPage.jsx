import * as React from 'react';

import {Navigation} from '../Navigation';

export class IndexPage extends React.Component {
    state = {};
    
    constructor(props) {
        super(props);
    }
    
    render() {
        return (
            <div>
                <Navigation></Navigation>
                
                {this.props.children}
            </div>
        );
    }
}
